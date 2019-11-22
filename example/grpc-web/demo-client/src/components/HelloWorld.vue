<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button v-on:click="greet">Greet</button>
    <button v-on:click="fetchBooks">Fetch Books</button>
  </div>
</template>

<script>

import { BookServiceClient } from '../grpc/Book_grpc_web_pb';
import { Empty } from '../grpc/Book_pb';

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },

  mounted() {
    this.client = new BookServiceClient("http://localhost:8085", null, null);
  },

  methods: {
    fetchBooks() {
      let empty = new Empty()
      this.client.findAll(empty, {}, (err, response) => {
        if (err) {
          console.log(err)
        } else {
          console.log(response.toObject());
        }
      });
    },
    greet() {
      alert('Hello !');
    }
  }
}
</script>
