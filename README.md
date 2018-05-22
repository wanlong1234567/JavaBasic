# JavaBasic
Java基础
1.Linux:
  1)开源的操作系统、免费的
    主要是服务器操作系统，而Java主要是服务器端开发
  2)Linux与Windows目录结构区别:
    2.1)文件系统不同:
	      Linux:目录     Windows:盘符
	2.2)外部设备映射不同:
	      Linux:挂载点   Windows:盘符
	2.3)安全级别不同:
	      Linux:高       Windows:低
  3)基于命令操作的:
    3.1)pwd:显示当前工作目录
	3.2)ls:查看当前工作目录的内容
	3.3)cd:改变当前工作目录
	     绝对路径:相对于根目录的位置，以/开头
		 相对路径:相对于当前目录的位置
		     .:当前目录
			..:上一级目录
2.Java开发环境:
  1)Java编译运行过程:----------常见面试题
    1.1)编译期:.java源文件，经过编译，生成.class字节码文件
	1.2)运行期:JVM加载.class并运行.class
	特点:跨平台，一次编程到处使用
  2)名词解释:-------------------常见面试题
    2.1)JVM:java虚拟机
	        加载.class并运行.class
	2.2)JRE:java运行环境
	        除了包含JVM以外，还包含了运行java程序所必须的环境
            JRE=JVM+java系统类库
	2.3)JDK:java开发工具包
	        除了包含JRE以外，还包含了开发java程序所必须的命令工具
			JDK=JRE+编译、运行等命令工具
  3)配置环境变量----------------了解
    3.1)JAVA_HOME:指向jdk的安装目录
	3.2)CLASSPATH:表示类的搜索路径，一般简写为.
	3.3)PATH:指向jdk下的bin目录
3.eclipse:
    IBM、开源的、免费的、不需要安装，仅需要解压即可


步骤:
1)新建Java项目/工程--------------小区
2)新建Java包---------------------楼号+单元号
3)新建Java类---------------------房子

注释:解释性文本
1)单行注释://
2)多行注释:/* */
3)文档注释:/** */


回顾:
1.Linux:
    开源的操作系统、免费、服务器
	目录、挂载点、安全级别高
	pwd,ls,cd 绝对路径:相对于根目录的位置，以/开头
	          相对路径:相对于当前目录的位置
			    .:当前目录  ..:上一级目录
2.Java开发环境:
  1)java编译运行过程:
    1.1)编译期:.java，经过编译，生成.class字节码文件
	1.2)运行期:JVM加载.class并运行.class
	跨平台，一次编程到处使用
  2)名词:
    2.1)JVM:java虚拟机
	2.2)JRE:java运行环境 JRE=JVM+java系统类库
	2.3)JDK:java开发工具包 JDK=JRE+编译、运行等工具
  3)配置环境变量:了解
3.eclipse:
   IBM、开源的、免费的、只需解压即可
   System.out.println("HelloWorld");






笔记:
1.变量:存数的
  1)声明:
      int a; //声明一个整型的变量，名为a
      int b,c,d; //声明三个整型的变量，名为b,c,d
  2)命名:
    2.1)只能包含字母、数字、_和$符，
	    并且不能以数字开头
	2.2)严格区分大小写
	2.3)不能使用关键字
	2.4)可以中文命名，但不建议
        建议"英文的见名知意"、"驼峰命名法"
  3)初始化:第一次赋值
    3.1)声明的同时初始化:
	      int a = 5; //声明整型变量a并赋值为5
	3.2)先声明后初始化:
          int a; //声明整型变量a
		  a = 5; //给变量a赋值为5
  4)使用:
    4.1)对变量的使用就是对它所存的那个数的使用
	      int a = 5;
		  int b = a+10; //取出a的值5，加10后，再赋值给整型变量b
		  System.out.println(b);   //输出变量b的值15
		  System.out.println("b"); //b，双引号中的原样输出
		  a = a+10; //取出a的值5，加10后，再赋值给a
		            //在a本身基础之上增10
	4.2)变量的使用必须与数据类型匹配
	      int a = 3.14; //编译错误，数据类型不匹配
	4.3)变量在使用之前必须声明并初始化
	      System.out.println(m); //编译错误，m未声明
		  int m;
		  System.out.println(m); //编译错误，m未初始化
2.基本数据类型:
  1)int:整型，4个字节，-21个多亿到21个多亿
    1.1)整数直接量默认为int型，但不能超范围，超范围则编译错误
	1.2)两个整数相除，结果还是整数，小数位无条件舍弃
	1.3)运算时超范围，会发生溢出，溢出是需要避免的
  2)long:长整型，8个字节
    2.1)长整型直接量需要数字后加L或l
	2.2)较大数的运算时，为了避免溢出，建议在第1个数字后加L
	2.3)System.currentTimeMillis()用于获取自
	    1970.1.1零时到此时此刻的毫秒数
  3)double:浮点型，8个字节
    3.1)浮点数直接量默认double型，若想表示float需在数字后加F或f
	3.2)double型数据在参与运算时，有可能会出现舍入误差
  4)char:字符型，2个字节
    4.1)采用Unicode编码格式，一个字符对应一个码
	    表现的形式是字符char，但实质上是码int(0到65535之间)
		ASCII码('a'--97  'A'--65  '0'--48)
	4.2)字符必须放在单引号中，只能有一个
	4.3)特殊字符需通过\转义
  5)boolean:布尔型，1个字节
    5.1)只能存储true和false
3.基本数据类型间的转换:
    基本类型从小到大依次为:
	   byte,short,int,long,float,double
	         char
  1)两种方式:
    1.1)自动类型转换:小类型到大类型
	1.2)强制类型转换:大类型到小类型
	      语法: (要转换成为的数据类型)变量
		        强转有可能会溢出或精度丢失
  2)两点规则:
    2.1)整数直接量可以直接赋值给byte,short,char，
        但不能超出范围
	2.2)byte,short,char型数据参与运算时，
	    先一律转换为int再运算
4.Scanner的用法:
  1)在package的下面:
      import java.util.Scanner;
  2)在main方法中:
      Scanner scan = new Scanner(System.in);
  3)在第2步之下:
      System.out.println("请输入年龄:");
      int age = scan.nextInt();
      System.out.println("请输入价格:");
	  double price = scan.nextDouble();

回顾:
1.变量:存数的
    int a; int b,c;
	int a=250; int a; a=250;
	int b = a+10; //取出a的值250，加10后，再赋值给b
    a = a+10; //在a本身基础之上增10
	System.out.println(a);
2.基本数据类型:
  1)int:整型，4个字节，5,25,250...
  2)long:长整型，8个字节，5L,250L,10000000000L...
  3)double:浮点型，8个字节，3.14,25.0,0.589...
  4)boolean:布尔型，1个字节，true,false
  5)char:字符型，2个字节，'你','y','7',' ','\''...
3.基本数据类型间的转换:
  1)两种方式:
    1.1)自动:小到大
	1.2)强制:大到小
  2)两点规则:
      byte b1 = 5;
	  byte b2 = 6;
	  byte b3 = (byte)(b1+b2);
4.Scanner的用法:
    import java.util.Scanner;
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入...");
	int a = scan.nextInt();
	int b = scan.nextDouble();


笔记:
1.运算符:
  1)算术运算符:+-*/%,++,--
  2)关系运算符:>,<,>=,<=,==,!= boolean
  3)逻辑运算符:&&,||,! boolean
  4)赋值运算符:=,+=,-=,*=,/=,%=
  5)字符串连接运算符:+
  6)三目运算符:boolean?数1:数2
2.分支结构:有条件的执行某语句，并非每句必走
  1)if:1条路
  2)if...else:2条路
  3)if...else if:多条路
  4)switch...case:多条路
    优点:效率高、结构清晰
	缺点:整数、相等
	break:跳出switch
  
  回顾:
1.运算符:
  1)算术:+-*/%,++,--
  2)关系:>,<,>=,<=,==,!= boolean
  3)逻辑:&&,||,! boolean
  4)赋值:=,+=,-=,*=,/=,%=
  5)字符串连接:+
  6)三目:boolean?数1:数2
2.分支结构:
  1)if:1
  2)if...else:2
  3)if...else if:多
  4)switch...case:多
    优点:效率高、结构清晰
	缺点:整数、相等
	break:跳出switch



笔记:
1.循环:反复执行一段相同或相似的代码
2.循环三要素:
  1)循环变量的初始化
  2)循环的条件(以循环变量为基础)
  3)循环变量的改变(向着循环的结束变)
  循环变量:在整个循环过程中所反复改变的那个数
3.循环结构:
  1)while:先判断后执行，有可能一次都不执行
  2)do...while:先执行后判断，至少执行一次
               要素1与要素3相同时，首选do...while
  3)for:应用率高，固定次数循环
4.break:跳出循环
  continue:跳过循环体中剩余语句而进入下一次循环
  
回顾:
1.适用情况:
2.嵌套循环:
3.数组:引用类型，相同数据类型元素的集合
    int[] arr = new int[10];
	int[] arr = {1,5,7};
	int[] arr = new int[]{1,5,7};
	System.out.println(arr.length);
    下标(0开始，最大到.length-1)
	arr[0] = 100;
	arr[3] = 300; //数组下标越界
	System.out.println(arr[arr.length-1]);
	for(int i=0;i<arr.length;i++){
	  arr[i] = 100;
	  System.out.println(arr[i]);
	}
	System.arraycopy(a,1,a1,0,4);
	int[] a1 = Arrays.copyOf(a,6);
	a = Arrays.copyOf(a,a.length+1); //扩容
	Arrays.sort(arr); //升序
    冒泡:
	  1)5个数冒4轮
	  2)每一轮都是从第1个元素开始冒
        每一次都是和它的下一个元素比
	  3)冒出来的就不带它玩了





正课:
1.方法:
  1)封装一段特定的业务逻辑功能
  2)方法尽可能的独立，一个方法只干一件事
  3)方法可以被反复调用多次
  4)减少代码重复，有利于代码维护，有利于团队协作开发
2.方法的定义:
    修饰词 返回值类型 方法名(参数列表){
	  方法体
	}
3.方法的调用:
  3.1)无返回值: 方法名(有参传参);
  3.2)有返回值: 数据类型 变量 = 方法名(有参传参);
4.return:
  1)return 值; 1.1)结束方法的执行  1.2)返回结果给调用方
  2)return;    2.1)结束方法的执行



回顾:
1.循环:反复执行一段相同或相似的代码
2.循环三要素:
  1)循环变量的初始化
  2)循环的条件(以循环变量为基础)
  3)循环变量的改变(向着循环的结束变)
  循环变量:在整个循环过程中所反复改变的那个数
3.循环结构:
  1)while:先判断后执行，有可能一次都不执行
  2)do...while:先执行后判断，至少执行一次
               要素1与要素3相同时首选do...while
  3)for:应用率最高，固定次数循环
4.break:跳出循环
  continue:跳过循环体中剩余语句而进入下一次循环


正课:
1.三种循环结构的更佳适用情况:
  1)while:"当..."循环
  2)do...while:"直到..."循环
               要素1与要素3相同时首选do...while
  3)for:固定次数循环
2.嵌套循环:
  1)循环中套循环，一般多行多列时使用，外层控制行，内存控制列
  2)执行规则:外层循环走一次，内层循环走所有次
  3)建议:嵌套的层数越少越好，能用一层就不用两层，能用两层不用三层
         若需求必须要通过三层以上的循环才能解决，说明设计有问题
  4)break只能跳出一层循环
3.程序=算法+数据结构
  1)算法:解决问题的流程/步骤(顺序、分支、循环)
  2)数据结构:将数据按照某种特定的结构来保存
             数怎么存
	设计良好的/合理的数据结构会导致好的算法
4.数组:
  1)相同数据类型元素的集合
  2)数组是一种数据类型(引用类型)
  3)数组的声明:
      int[] arr = new int[10];
  4)数组的初始化:
      int[] arr = new int[3]; //0,0,0
	  int[] arr = {1,4,7}; //1,4,7
	  int[] arr = new int[]{1,4,7}; //1,4,7
	  int[] arr;
	  arr = {1,4,7}; //编译错误，此方式只能声明的同时初始化
      arr = new int[]{1,4,7}; //正确
  5)数组的访问:
    5.1)通过(数组名.length)可以获取数组的长度
	      int[] arr = new int[4];
          System.out.println(arr.length); //4
	5.2)通过下标/索引来访问数组中的元素
	    下标从0开始，最大到(数组的长度-1)
		  int[] arr = new int[3];
		  arr[0] = 100;
		  arr[1] = 200;
		  arr[2] = 300;
		  arr[3] = 400; //数组下标越界异常
		  System.out.println(arr[arr.length-1]); //输出最后一个元素
  6)数组的遍历:
      int[] arr = new int[10];
	  for(int i=0;i<arr.length;i++){
	    arr[i] = 100;
	  }
	  for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
	  }
	  for(int i=arr.length-1;i>=0;i--){
	    System.out.println(arr[i]);
	  }
  7)数组的复制:
    7.1)System.arraycopy(a,1,a1,0,4);
	7.2)int[] a1 = Arrays.copyOf(a,6);
	    a = Arrays.copyOf(a,a.length+1); //扩容
  8)数组的排序:
    8.1)Arrays.sort(arr); //升序、效率高
	8.2)冒泡原理:
	    8.2.1)四个数冒三轮
		8.2.2)每一轮都是从第1个元素开始冒
		      每一次都是和它下一个元素比
		8.2.3)冒出来的就不带它玩了

猜字符小游戏:
一.设计数据结构:变量
   1)char[] chs;   //随机字符数组
   2)char[] input; //用户输入的字符数组
   3)int[] result; //对比的结果
   4)int score;    //得分
二.设计程序结构:方法
   1)主方法:
     public static void main(String[] args){
	   //...
	 }
   2)生成随机字符数组
     public static char[] generate(){
	   char[] chs = new char[5];
       //...
	   return chs;
	 }
   3)对比:随机字符数组与用户输入的字符数组
     public static int[] check(char[] chs,char[] input){
	   int[] result = new int[2];
	   //...
	   return result;
	 }
三.设计算法:方法体
        String str = "hello";
   1)将字符串转换为大写字母和小写字母
        str = str.toUpperCase(); //转成大写字母
		str = str.toLowerCase(); //转成小写字母
   2)将字符转换为字符数组
        char[] input = str.toCharArray();
   3)判断字符串内容是否相等
        if(str.equals("EXIT")){
		}
