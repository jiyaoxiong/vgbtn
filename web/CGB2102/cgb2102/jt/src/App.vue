<template>
  <div id="app">
    <Item/>
  </div>
</template>

<script>
//第一步：导入，第二步：引用，第三步，写标签
//坑，这里必须写./，否则出错
import Item from './components/Item.vue'

export default {
  name: 'App',
  components:{
    Item
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
