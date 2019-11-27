<template>
  <div id="app">
    <BookPage title="Welcome to gRPC demo"/>
  </div>
</template>

<script>
import BookPage from './components/BookPage'

export default {
  name: 'app',
  components: {
    BookPage
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
  margin-left: 60px;
  margin-right: 60px;
}

button {
  background-color: #42b983;
  border: none;
  color: white;
  padding: 12px 30px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin-right: 10px;
}

.column {
  float: left;
  width: 50%;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}
</style>
