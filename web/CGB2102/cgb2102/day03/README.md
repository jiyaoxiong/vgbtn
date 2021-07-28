## 知识回顾
GIT开发人员必会工具，软件代码管理，版本控制工具  
CVS、SVN、GIT  
CVS/SVN软件项目文件管理版本控制工具，  
	软件项目生命周期：过程中有很多相关这个项目文档  
	合同，需求调研报告，概要设计说明书，详细设计说明书（伪类），代码  
	测试报告、上线运行、开发帮助手册、维护手册、验收报告、  
	这些文档并不是所有项目人员都可见，设置细粒度权限控制  
GIT 代码管理，主要管理代码  
  
### git结构
主要由4部分组成：  
1）工作空间：本地指定目录，它在每个开发者自己电脑，.git隐藏目录（git相关管理）  
2）本地索引：只是记录每次变化（新增、修改、删除），提交依据  
3）本地仓库：近似window回收站，当没有网络，暂存信息  
4）远程仓库：互联网、公司内部专门git服务器、镜像仓库  

### git常用命令
1）第一次使用  
	a.先在远程仓库中创建新的仓库（仓库可以多个）  
	b.在本机创建一个目录，名称和仓库名称相同  
	c. git init 把普通目录变成git管理的目录  
	d. git remote 实现远程某个仓库和这个目录关联  

git remote add origin http://gitee.com/nutony/res.git 往git管理信息列表中添加链接  
这个链接已经存在  
git remote rm(remove) origin 从列表中删除，重新添加  

2）日常每天都使用  
git add 指定一个文件名称，通配符.	作用：把本地文件（多个文件）写索引列表  
git commit -m "提交原因"，作用：按索引列表变化去对应执行，把代码放入本地仓库（checkout）  
git push -u origin  master，git push，作用：把本地仓库内容更新到远程仓库（大家共享）  

3）必会的命令  
git clone 克隆，把整个远程仓库内容复制到本地  
	git clone https://gitee.com/nutony/res.git  
	提交变化需要仓库管理员他去手工审核，合并，不合并不生效。    
	
	git规范，github全球远程仓库，gitee码云国人，镜像仓库（每10分钟）  
	git clone它可以克隆任何满足git规范的远程仓库或者镜像仓库  
	
	克隆能否只克隆单个文件？不行  
	下载qr.jar  
fork分支  
	找一个开源代码，主分支  
	进行fork，复制，开启一个新的分支  
	fork之后把别人仓库就复制到你的git中的一个仓库  
	
4）删除仓库 gitee  
	在gitee上找到要删除仓库，进行密码的校验。  
	选择要删除的仓库，仓库标题最后“管理”  
	在左侧菜单选项中“删除仓库”  
	弹出确认删除，要求你把仓库名称在输入一遍  
	输入密码确认。  

### html页面h5 和css样式 3.0
h5扩展了html标签，css功能更加强大  

播放音频和视频（格式的要求）mp4  
http://act.codeboy.com  
音频：http://act.codeboy.com/doc/consultation/audio/1.m4a  
audio/1.m4a  

视频：http://act.codeboy.com/tools/mp4/stu/2008-04.mp4  

大家准备好这两个文件  
网站打开不开或者慢的同学，找自己机器上的音频和视频文件即可  


### 页面请求的两种方式
1）get请求，会自动把页面表单中参数拼接到url后面  
2) post请求，隐藏这些参数  

### css（标准）升级更漂亮的样式 Bootstrap（第三方）
css标签浏览器都支持  
第三方，浏览器不直接支持，到包，导入是样式表文件 *.css  
就是把我们自己写的样式style标签中的内容放入一个单独文件  

获取bootstrap.css文件，官网，菜鸟教程  
https://www.runoob.com/bootstrap/bootstrap-forms.html  

https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css  
这个官网提供样式表文件链接，css样式表文件纯文本  
网页上可以直接访问这个文件，另存为就可以放在本地访问  

### 工作遇到新的知识
看demo，上手更快  
bootstrap 利用demo学习它各个样式怎么使用？  
预定义样式，写死，效果是死板，不够灵活  
依赖这种外部样式ui用户界面，必须全套使用样式结构  

特点：  
1）body整个内容放在div中，class="container"  
2）每行修饰，把每行组件都放在一个div  
	class="form-group"  
3）如果文字就使用lable标签，分组（标签+汉字）  
	class="from-controll" 修饰文本框、数字框、下拉框  
	class="radio-inline" 修饰单选框，标签和汉字在一行  
	class="checkbox-inline" 修饰多选框，  
	class="btn btn-success/danger/primary/info" 修饰按钮  

element-ui 饿了吗出品，    

### 动态网站技术 javascript（js）
html和css无法和你交互，动态去改变js作用。  

javascript和java没有任何关系  
js定位只是浏览器，js（script）脚本，弱语言，动态语言 var改变类型  
java全能applet小程序，强语言，静态语言（安全）String  

### 怎么和页面交互
获取页面标题  
<title> js就可以获取标题，修改标题  

javascript出品一套api  
把页面定义DOM树，快速去定位页面某个位置（标签）  

document对象，代表页面，有很多方法去获取页面标签，  
window对象，提示框alter  

在页面新加标签< script >位置可以任意</ script >  
位置可以随意，习惯header标签中，body最后面  

获取页面标签，js提供4中方式  
1）tagName 标签名称（数组） 标签名相同，a[0] 下标是从0开始  
	document.getElementsByTagName  
2）name 标签起名字（数组）   
	document.getElementsByName  
3）*className 标签的class属性 class="pdd"（数组）  
	document.getElementsByClassName  
4）*id 标签的id属性（一个值）id页面唯一  
	document.getElementById  

哪怕页面得到是一个值，它也是数组，这个数组只有一个元素  
document.getElementsByTagName("a")[0].href  
document 文档对象  
.getElementsByTagName 通过tagName方式获取页面标签，数组  
("a") 指定标签名称，参数，字符串  
[0]  从数组中挑选第一个元素，淘宝标签对象  
.href 标签的属性  

script有时不是随便放置的，js代码中如果访问页面元素，这段js代码就必须放在 元素的后面就可以  

### ES标准化组织，强化应用javascript，最新ES7，主流企业ES6
体验ES6新标准一些特性  
1）定义变量 （在js中万物var），定义变量是没有类型  
var a = 10; //js特点会自动类型推断。a是整数  
var b = "abc";	b字符串  
let a = 10;  
2）常量const，早期js是没有常量，ES6新标准有    
3）新语法，拉姆达表达式，ES6中习惯箭头函数（=>）语法简洁    
var e60 = (x,y) => { js语句 }  
有很多语法的省略，无参、一个参数、两个参数、省略写法  
var js0 = function(){ }  

## 小结
### 引入bootstrap样式
第三方，link标签：rel=stylesheet，href="css/bootstrap.css"  
*.css 没有压缩（网络传输额外长度，方便开发者观看）  
*.min.css 压缩（一行）（网络传输快，不方便开发者看）  

为什么要使用bootstrap呢？  
定义好了一整套页面表现，比h5漂亮很多，  

它预定了很多样式  
1）官网  
2）网上demo（菜鸟、百度）  

### 页面两种调试方式
1）window.alert( info ) 缺点，如果是对象不能看到里面内容  
2）console.log( info ) 它可以展现对象里的内容（推荐）  

### 获取页面元素有4种方式
1）getElementsByTagName 标签名，多个值，数组，数组下标0  
2）getElementsByName 属性name，多个值，数组  
3）getElementsByClassName 属性class，多个值，数组  
4）getElementById 属性id，唯一  

### javascript基础语法
js函数体中写分号  
script标签，它写分号  
js对象中，不能写分号，写的是属性分割，逗号，  




