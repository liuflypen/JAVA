DOS  

cls清屏   exit退出
窗口的内容 右键可直接复制
dir 列出当前目录下所有的子文件或者子目录
cd  改变目录 cd+目录的路径包括绝对路径跟相对路径
绝对路径 表示该路径从某个磁盘的盘符下作为出发点的路径
相对路径 表示该路径从当前所在的路径下作为出发点的路径
cd..回到回到上级目录  cd/ 直接回到跟目录
切换盘符 c：回车 d: 回车 c:回车
文件扩展名要打开
编译阶段
检查java源程序是否符合java语法
符合java语法则能够生成正常的字节码文件（xxx.class）
不符合java语法规则ze无法生成字节码文件
字节码文件无法再操作系统中直接执行
编译阶段的过程
需要在硬盘的某个位置（任意）新建一个.java扩展名的文件
该文件被称为java源文件，该文件当中编写的是java源代码/源程序
必须符合java语法规则
需要JDK 当中自带的javac.exe命令进行java程序的编译。
Javac是一个java编译器的工具
Javac在dos命令窗口中使用
一个java源文件可以编译生成多个.class文件
字节码文件/class文件是最重要执行的文件 所以 class文件生成之后，java源文件删除并不影响java程序的执行
但一般java源文件不要删除 因为classs文件最终执行效果不理想，需要重新修改java源程序，然后将java源程序重新编译生成新的class文件然后再运行class程序 生成新的效果
编译结束之后可以将class文件拷贝到别的操作系统当中运行
运行阶段（可以在其他操作系统当中使用，跨平台）
jdk安装之后 除去自带一个javac.exe之外，还有另一个工具/命令，叫做java.exe 
java.exe主要负责运行阶段
java.exe在Dos窗口中使用
使用方法: java+类名
例如   硬盘有一个A.class，那么就这样用：java A
    硬盘有一个B.class，那么就这样用：java B
    硬盘有一个C.class，那么就这样用：java C
不能写成 java.A.class(这种方式是错误的)
运行阶段的过程
·打开Dos命令窗口
·输入：java A
·java。exe命令会启动Java模拟器（JVM），JVM会启动类加载器ClassLoader
·ClassLoader会去硬盘上搜索A.class文件 找到该文件则将该字节码文件装载到JVM当中
·JVM将A.class字节码文件解释称二进制1010101010这样的数据
·然后操作系统执行二进制和底层硬件平台进行交互
开始第一个Java程序
保证计算机当中安装了文本编辑器
安装JDK(已下载)【在oracle官网下载】
JDK JRE JVM的关系
JDK目录
  JDK/bin:该目录下放了很多命令，例如以下两个
  javac.exe负责编译
  java.exe负责运行
开发HelloWord.java源程序
将HelloWord.java源程序通过javac工具进行编译：
—— 首先需要解决的问题是：javac命令是否可用
javac命令怎么用？
javac+java源文件路径(两条路径都可以)
运行java程序：
-需要使用java.exe命令
-首先测试java命令是否可用
-使用方式：
java 类名
硬盘上有HelloWord.class 那么类名就是：HelloWord  
注意：java命令后面跟的不是文件路径 而是一个类的名字
首先需要先将Dos窗口中的目录切换到HelloWord.class文件所在的目录。
然后直接执行java HelloWord
![结果](https://raw.githubusercontent.com/liuflypen/IM/main/tupian/%E5%9B%BE%E7%89%87_20230414183427.png?token=GHSAT0AAAAAACBA5ETERK3WLO6FELNDI3DGZBZEG3Q)
