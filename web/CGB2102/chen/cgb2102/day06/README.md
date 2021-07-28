### 知识回顾  
Vue框架，为什么诞生Vue  
JavaScript，ES6，ES7，TypeScript和Java、C强语言开始竞争  
JavaScript定位只局限浏览器，脚本语言，弱语言  
NodeJS相当于java JVM环境，  

JavaScript语言，语法，学习api  
jQuery封装Js，简化语法，学习api，简单很多，高度抽象，难以记忆  
框架Vue，渐进式框架vue.js（几百k），vue脚手架（200m）  
vue引入MVVM框架思想，根据后端经验演化，后端ModelViewController分层概念  
Model数据（ajax请求访问后台SpringMVC.controller，最终返回json，转换js对象）  
View视图（展现html+css）  
vm控制（前台控制）Controller（后台控制）ViewModel，解析数据把数据在页面呈现  
（渲染render）  
MVVM结构清晰，代码分不同区域去编写，数据区data，视图区div id=app  
大型项目，代码清晰，好定位，好修改代码  

### Vue有两个特点：  
1）数据驱动，只要操作数据，页面上引用（插值表达式，v-xxx指令）动态显示内容  
2）组件化，element-ui一套组件，别人可以写好组件，我们直接使用，开发效率  

### Vue结构：  
1）导入vue.js文件  
2）展示区域：div id="app"，{{msg}}  
3）创建vm = new Vue对象  
	el:"#app"  
	data:{  
		msg: "hello vue"  
	}  

### data语法3种：  
1）vue标准写法  
2）vue函数写法，返回值 return js对象  
3）es6新标准函数写法（element-ui）  

### 把vue结构定义HBuilderX快速定义一个模板文件  
C:\Users\tony  
\AppData\Roaming\HBuilder X  
\templates\file\html  
这个模板文件保存每个用户它自己的数据临时空间（目录）  
直接创建一个txt文件，随便命名vue.txt  
把模板拷贝代码复制进去，保存即可  

### Vue框架增加：路由和组件  
1）路由：Vue开发SPA结构网站，一个页面（列表转新增页面，新增页面保存数据，跳转到列表页面）  
它的操作（新增，修改）没有离开当前页面  
add  
update  
不同路径  
2）组件，可以自己写好积木一块，也可以利用第三方的，搭起最终结构（复用）  

Vue脚手架，项目  
不是引入Vue.js能搞定的！  
搭建条件：安装NodeJS（JVM）15安装，win7操作 8版本  
执行一系列命令：dos命令。  
自动安装npm（nodejs含有npm）和webpack（nodejs含有webpack)  
安装如果中间步骤没有成功，重头做可以了，  
依赖外网  
NPM打包工具，nodejs结合使用的，类似git远程仓库，执行npm命令会把远程这些资源（js文件）下载到本地  
js是没有编译，边解释边执行，性能低。es6/TypeScript支持编译（预处理、压缩），  
webpack提升vue项目执行性能  

### 三个环境：  
1）开发环境：dev			启动nodejs服务，npm run dev  
2）测试环境：test  
3）生产环境：prod  

### Vue-cli脚手架安装过程
npm -v		//先验证nodejs是否安装正常  

npm config get registry		//获取当前配置npmjs.org  
npm config set registry https://registry.npm.taobao.org  

npm install vue-cli -g	//安装vue脚手架  
vue -V		//检查vue脚手架是否安装成功，如果版本号出现，代表安装成功，  
				如果不出现，提示错误，就失败  

安装不能出现ERR（错误，网站不能用NOTFOUND），  
WARN(警告是一个提示没有问题)  

如果黑窗口不小心鼠标拖动，这个界面部分字符被选中  
DOS黑窗口会进入阻塞状态，不会执行下面内容  
解决办法：按下回车键，就不会选中，它会继续执行命令内容  

vue.js，一个页面  
vue项目，一个总目录，里面有很多内容（脚手架），  
快速开发，有一套规范（写代码比较死板）  

### 安装过程的选项
vue init webpack jt		//在当前目录会创建jt目录，jt是项目名称  
执行上面命令，要配置很多选项，y，n （死记）  


Project Name								项目名称，默认，回车
Project description 						默认，回车  
Author	chenzs								作者  
vue build									默认，回车  
install vue-router?						是否安装router，输入：y 安装  
Use ESLint to lint your code?				规则引擎，过于严苛，输入：n  
Setup unit tests?							单元测试，输入：n  
Setup e2e tests with Nightwatch(Y/n)?	测试框架Nightwatch，输入：n  
Should we run 'npm install' for   
you after the project has been created?	默认npm，回车  


### 安装及特殊文件
vue init webpack jt  

node_modules	安装需要调用其他js库，这个是临时目录，  
这个目录中的所有内容可以删除，再次编译时，会自动下载  

index.html			首页，web网站规定，打开当前目录index.html  
	http://localhost:8080/，规范：默认访问这个路径下的index.html  
	
	
build/webpack.base.conf.js		config缩写conf	基础base配置信息  
build/webpack.dev.conf.js		dev	开发环境			  
build/webpack.prod.conf.js		prod 生产环境  

src/assets/logo.png					静态资源，vue图片  
src/components/HelloWorld.vue	component组件，这个目录存放自定义组件  
node_modules	存放第三方组件，这里内容不许动  
											
src/router/index.js		路由，怎么加载自己写组件  
src/App.vue				根组件，自定义组件都是App根组件儿孙  
src/main.js					index.html会自动加载main.js，它里面就加载App.vue  

### 组件使用
Vue项目极其复杂，它们这些文件是存在联系  
例如：  
1）自定义组件，在components目录下：Item.vue  
2）声明，注册，App.vue  

3）引入第三方Element-ui，在全局main.js中引入  

### 启动服务
cd jt  
npm run dev  

启动nodejs服务，就是网站  
访问http://localhost:8080，注意如果端口冲突 tomcat/oracle  
nodejs太聪明，会自动换端口，如果8080端口冲突，可能8081  


一般情况下node安装完，它会自动配置全局路径，window中配置  
配置过程是自动，Path全局变量没设置  
在随意目录中输入node，提示这个命令不存在  
解决办法：  
1）重新安装nodejs版本  
2）去修改全局配置，自己去添加Path  

### 导入项目
左侧菜单空白处，右键，选择”导入“  
在选择“从本地目录导入”，  
浏览你创建vue项目目录  

### *.vue文件
特点：这个文件由3个部分组成  
template 模板，html片段  

Component template should contain exactly one root element.  
 If you are using v-if on multiple elements,  
 use v-else-if to chain them instead.  
 
 模板中必须唯一一个根元素，都放在一个div中  

script  
导出定义组件，给其起一个名字App，其他地方就可以按名字导入  
export default {  
  name: 'App'  
}  
定义好组件，引入import，然后标签```<App></App> <App/>```  

style  
样式  

### 自定义组件
1）创建自己组件文件 Item.vue  
里面3部分怎么填写  
2）注册（引用）直接生效使用  

每个组件是天然隔离，即使属性名定义一样，也不会干扰  

### 调用外部的组件，Element-UI 饿了吗出品
这个组件虽然没有再更新，但是它已经非常成熟，足够做大型软件架构  
学习套路，思想，  

实现了一套全面网页界面开发，开发事半功倍，开发效率高  

npm i element-ui -S  
i代表install安装，-S 安装到生产环境，-D安装到开发环境  

index.html，main.js（全局导入），App.vue（自定义组件）  
//导入外部组件  
import ElementUI from 'element-ui';  
//elementui提供样式修饰总文件  
import 'element-ui/lib/theme-chalk/index.css';  

//把这个样式加入Vue项目中  
Vue.use(ElementUI);  

先加入小图标  
引入栅格系统,html没有它不能适应屏幕大小变化  
有了栅格系统，页面会自动根据屏幕大小来适应，  
默认24列，设置一个属性xl占几列(大屏幕)，sm占几列（小屏幕）  

elementui支持栅格  
```
<el-row>
  <el-col :span="24"><div class="grid-content bg-purple-dark"></div></el-col>
</el-row>
```
再加表格  
商品管理  
列表：商品名称、卖点、价格、描述（详情）  
表格头和html标准类似，但是表格的内容来自动态的  
vue数据区  
js对象，JSON字符串，数组对象  
数组[]，每条记录{name:'',sellPoint:'',price:100,note=''}  

对整个表格绑定一个:data属性  
值是从数据区获取的js数组对象  
可以理解为拿到数组，利用v-for进行遍历  
el-table-column 每个列  
每次遍历，prop属性，对应每条数据里的key  
label是中文名称  

### 按钮：  
新增、修改、删除  
element-ui中如何表达按钮，要给按钮加上事件  
绑定事件  
1）事件声明（函数）必须写在方法区  
	toadd，toupdate，del，save（新增、修改保存）  
2）前期绑定写死 v-bind:click，@click  

### Vue项目（脚手架+自己在添加代码）
Vue项目庞大，大型项目，自定义组件可以复用  
npm安装方式，它会自动下载你所需要的组件，依赖  
它底层会实现自动管理 package.json文件中定义  

安装到本地，使用时就无需联网，  
开发vue项目就如虎添翼，无需写通用代码，之间就可以调用  
总的开发工作量减少  

### 搞清使用vue脚手架，它基础文件关系
网站规范，启动服务（nodejs/tomcat web中间件）  
http://localhost:8080/  
nodejs非常聪明如果启动时已经占用8080，会重新定义端口8081  

注意：黑窗口，不能选中，就阻塞，就不会继续执行  
解决：回车，不选中  

### 自定义组件
1）要求存放src/components目录，Item.vue，后缀必须.vue文件  
一个vue模板文件由3个部分组成  
template标签，html片段，代码可以加一些动态内容  
	这些内容组件会自动翻译，翻译html代码，渲染！  
	要求，里面内容必须只有一个根标签  
script标签  
	
style标签  