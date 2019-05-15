<template>
  <footer>
    <span class="footer-inner-wrapper">
      <p>{{footerdescription}}</p>
      <h4>{{footerprivacylabel}}</h4>
      <p>{{footercopy}}</p>
    </span>
  </footer>
</template>

<script>
export default {
  name: "Footer",
  props: {},
  data: function() {
    return {
      footerdescription:
        "Learn more about Skava Commerce and upcoming events at Skava.com",
      footerprivacylabel: " Privacy Policy",
      footercopy: "© 2019 Skava. All rights reserved."
    };
  }
};
</script>

<style scoped>
footer {
  background: #535353;
  color: white;
  height: 33vh;
  text-align: center;
  display: flex;
  flex-direction: column;
}
footer span.footer-inner-wrapper {
  margin: auto auto 37px auto;
}

p {
  margin: 0px;
  padding: 0px;
}

@media only screen and (max-width: 768px) {
  footer {
    width: 100%;
    height: 200px;
    position: absolute;
    bottom: 0;
    z-index: 0;
    padding: 30px;
    font-size: 12px;
  }
  footer span.footer-inner-wrapper {
    margin: auto auto 0 auto;
  }
}
</style>