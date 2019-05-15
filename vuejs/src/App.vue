<template>
  <div id="app">
    <Header/>
    <Container/>
    <Footer/>
  </div>
</template>

<script>
import Header from "./components/Header";
import Container from "./components/Container";
import Footer from "./components/Footer";

export default {
  name: "App",
  components: {
    Header,
    Container,
    Footer
  }
};
</script>

<style>
body {
  margin: 0;
  padding: 0;
  font-family: "Roboto";
}
* {
  box-sizing: border-box;
}
</style>
