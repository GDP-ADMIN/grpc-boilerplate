<template>
  <div class="hello">
    <h1>{{ title }}</h1>
    <button v-on:click="fetchBooks">Fetch Books</button>
    <dir  v-bind:key="index" v-for="(book, index) in books">
      <BookItem v-bind:book="book"/>
    </dir>
  </div>
</template>

<script>

import { BookServiceClient } from '../grpc/Book_grpc_web_pb'
import { Empty } from '../grpc/Book_pb'
import BookItem from './BookItem'

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
    fetchBooks: async function() {
      let request = new Empty();
      this.client.findAll(request, {}, (err, response) => {
        if (response) {
          this.books = response.getBookList()
        } else {
          console.log(err.message)
        }
      });
    },
  }
}
</script>
