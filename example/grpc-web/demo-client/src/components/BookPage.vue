<template>
  <div class="hello">
    <h1>{{ title }}</h1>
    <div class="row">
    <div class="column">
      <h3>gRPC</h3>
      <button v-on:click="fetchBooks">Fetch Books</button>
      <button v-on:click="fetchBooksStream">Stream Books</button>
      <h3>REST API</h3>
      <button v-on:click="fetchBooksApi">Fetch Books API</button>
    </div>
    <div class="column">
      <dir  v-bind:key="index" v-for="(book, index) in books">
      <BookItem v-bind:book="book"/>
    </dir>
    </div>
    </div>
  </div>
</template>

<script>

import { BookServiceClient } from '../grpc/Book_grpc_web_pb'
import { BookMessage, Empty } from '../grpc/Book_pb'
import BookItem from './BookItem'
import axios from 'axios'

export default {
  name: 'BookPage',
  components: {
    BookItem
  },

  props: {
    title: String
  },

  data: function() {
    return { books: [] }
  },

  mounted() {
    this.client = new BookServiceClient("http://localhost:8085", null, null)
  },

  methods: {
    fetchBooks() {
      let request = new Empty()
      let start = new Date()
      this.client.findAll(request, {}, (err, response) => {
        if (response) {
          let interval = new Date() - start
          console.log("Interval fetch all = " + interval)
          this.books = response.getBookList()
        } else {
          console.log(err.message)
        }
      });
    },

    fetchBooksStream() {
      let stream = this.client.streamAll(new Empty(), {})
      this.books = []
      let start = new Date()
      let chunkNumber = 1
      stream.on('data', (response) => {
        let interval = new Date() - start
        console.log("Interval stream = " + interval + ", chunk number " + chunkNumber)
        if (response) {
          this.books = this.books.concat(response.getBookList())
        }
        chunkNumber++
      });
    },

    fetchBooksApi() {
      let start = new Date()
      axios.get('http://localhost:9090/books').then(res => {
        let bookData = res.data
        this.books = bookData.map(item => {
          let book = new BookMessage()
          book.setTitle(item.title)
          book.setAuthor(item.author)
          return book
        });
        let interval = new Date() - start
        console.log("Interval API = " + interval)
      }).catch ((err) => {
        console.log(err);
      })
    }
  }
}
</script>
