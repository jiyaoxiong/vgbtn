  # 前端：  
1）开发人员划分：  
   a.前端工程师：作页面，网站  
   b.后端工程师：数据存储，获取  
   c.测试工程师：单元测试、@Test、集成、压力(高并发)  
   d.运维工程师：保证机器和网络运行  
   e.售前售后工程师：卖产品，后期服务  
 2)成长路线： CTO技术总监<--架构师 <-- 高级程序员、系统分析师<--中级程序员<--初级程序员<--菜鸟

  # 总结：  
前端如何去学习？  
做到，基础英文死背硬记：center居中  
html 标签：10几个，20几个  
css样式：20几个  
javascript api(document.getElementById("username"))，  
jQuery（$("#username")）  
 *Vue 数据驱动

  # 今日任务：   
  ## 1) HTML(hyper text mark lanuage)超文本（能够存入图片、声音、视频等多媒体文件）标记（预定义修饰）语言  
  header标题，预定义修饰 利用HTML就可以实现原始的页面 标签：闭合内容 头信息，title，编码utf-8，安全信息token  
  <link>小图标，加入外部样式表css   
  <script> javascript   
  <body>页面展现内容   
  ```
  <!DOCTYPE html>
  <html>
  	<header>
  		<title>我的网页</title>
  	</header>
  	<body>
  		<h1>我的</h1>
  		<h2>目录</h2>
  		内容
  	</body>
  </html>
  ```
  
  ### HTML编辑工具
  HTML纯文本，任何的文本编辑器都可以来实现，  
  专业工具：  
  eclipse/idea，主要java类  
  hbuilderx/vs-code  
  
  使用hbuilderx的步骤：  
  1）工程（目录），必须先创建一个目录（不要有中文，空格）  
  2）打开目录  
  3）创建html文件  
  
  ### hbuilderx浏览html页面有两种方式：
  1）创建html，使用浏览器浏览（手动刷新）
  2）独有，启动一个web服务（自动刷新）推荐
  启动nodejs服务（web服务），自动端口8848
  
  ![](/photo/1.jpg)
  
  ### 如果html文件乱码
  1）设置展现字符集：<meta charset="utf-8"> 
  2）文件本身编码，默认asci，改成utf-8（另存） 

## 2) CSS   

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>我的网页</title>
	</head>
	<body>
		<h1>我的第一个网页</h1>
		<font size="30" color="red">helloworld</font>
		<div style="font-size: 100px;color: bisque;">你好，java</div>
	</body>
</html>
```
## 3) 永和订单小票   
（注：专业术语多用百度百科查询）  
