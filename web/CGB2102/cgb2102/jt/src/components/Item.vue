<template>
  <div>
    <el-row>
      <el-col>
        <h1><i class="el-icon-eleme"></i>{{sysname}}</h1>
      </el-col>
    </el-row>

    <!-- 传统HTML页面布局，横向布局不易实现，
    新的布局方式flex，支持新属性justify -->
    <el-row type="flex" justify="start">
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
            <!-- 增加template标签，动态获取当前行的索引的数据 -->
            <template slot-scope="s">
              <el-button type="success" @click="toupdate(s.$index,s.row)" icon="el-icon-edit">修改</el-button>
              <el-button type="danger" @click="del" icon="el-icon-delete">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-col>
    </el-row>

    <!-- 定义对话框 -->
    <el-dialog :visible.sync="dialogVisible" width="30%" title="提示">
      <span>
        <!-- 加入一个form表单 -->
        <el-form :model="m" label-width="70px">
          <el-form-item label="标题:">
            <el-input v-model="m.title"></el-input>
          </el-form-item>

          <el-form-item label="卖点:">
            <el-input v-model="m.sellPoint"></el-input>
          </el-form-item>

          <el-form-item label="价格:">
            <el-input v-model="m.price"></el-input>
          </el-form-item>

          <el-form-item label="详情:">
            <el-input v-model="m.note" type="textarea"></el-input>
          </el-form-item>

        </el-form>
      </span>
      <span slot="footer" class="dialog-footer">
        <el-button type="danger" @click="dialogVisible=false">取消</el-button>
        <el-button type="success" @click="save">保存</el-button>
      </span>
    </el-dialog>

  </div>
</template>

<script>
  //定义一个组件导出,data采用es6新标准函数写法
  export default{
    name: 'Item',
    data(){
      return {
        sysname: '京淘电商平台',
        dialogVisible:false,//公用变量，修饰对话框是否展现
        isUpdate:false,
        m:{//为对话框的表单声明对象变量，设置初始值
          title:'',//当修改表单框内容时，此处的值随之改变，数据驱动的体现
          sellPoint:'',
          price:'',
          note:''
        },
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
          // 在方法区引入数据区数据,要加一个关键字this
          this.dialogVisible = true;//展现对话框
          this.m = {};//利用js动态的特点，把所有属性置空
          this.isUpdate = false;
        },
        toupdate: function(index,row){
          this.m = row;
          this.dialogVisible = true;
          this.isUpdate = true;
        },
        del: function(){
          console.log("执行删除方法")
        },
        save:function(){//新增和修改复用该按钮，主流开发习惯方式

        if(!isUpdate){//新增

        }else{//修改
        // 把当前数据，修改页面输入框内容，其结果将保存在m数据中
        this.list.splice(0,0,this.m);
        }
          this.dialogVisible=false;
        }
    }
  }
</script>

<style>
  textarea{
    font-family: "微软雅黑";
  }
</style>
