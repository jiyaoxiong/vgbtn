<template>
  <div>
    <el-row>
      <el-col>
        <h1><i class="el-icon-eleme"></i>{{sysname}}</h1>
      </el-col>
    </el-row>

    <el-row>
      <el-button type="primary" @click="toadd" icon="el-icon-search">新增</el-button>
    </el-row>

    <el-row>
      <el-col>
        <el-table :data="list">
          <el-table-column prop="title" label="标题"></el-table-column>
          <el-table-column prop="sellPoint" label="卖点"></el-table-column>
          <el-table-column prop="price" label="价格"></el-table-column>
          <el-table-column prop="note" label="详情"></el-table-column>

          <el-table-column label="[操作]" width="220">
            <el-button type="success" @click="toupdate" icon="el-icon-edit">修改</el-button>
            <el-button type="danger" @click="del" icon="el-icon-delete">删除</el-button>
          </el-table-column>
        </el-table>
      </el-col>
    </el-row>

  </div>
</template>

<script>
  //定义一个组件导出,data采用es6新标准函数写法
  export default{
    name: 'Item',
    data(){
      return {
        sysname: '京淘电商平台',
        list: [
          {
              title: 'javascript入门宝典',
              sellPoint: '这本书很畅销',
              price: 99,
              note: '这本是主流作家所写'
          },
          {
              title: 'java是全球第一大语言',
              sellPoint: 'java从业人最多',
              price: 188,
              note: '学java拿高薪'
          }
        ]
      }
    },
    methods:{
        toadd: function(){
          console.log("转向新增方法")
        },
        toupdate: function(){
          console.log("转向修改方法")
        },
        del: function(){
          console.log("执行删除方法")
        }
    }
  }
</script>

<style>
</style>
