package com.wanlong.day03;

/**
 * @author wanlong
 * Date:2018/5/22
 * 运算符的演示
 */
public class OpenDemo {
    public static void main(String[] args) {
        /*
         * 6.三目运算符:
         *   1)语法:
         *       boolean?数1:数2
         *   2)执行过程:
         *       计算boolean的值:
         *         若为true，则整个表达式的结果为数1
         *         若为false，则整个表达式的结果为数2
         */

		int a=55,b=8;
		int max = a>b?a:b;
		System.out.println("max="+max);


        /*
         * 5.字符串连接运算符:
         *   1)+:
         *     1.1)两边都是数字，则做加法运算
         *     1.2)两边若出现字符串，则做字符串连接
         */

		System.out.println(10+20+""+30); //"3030"
		System.out.println(10+20+30+""); //"60"
		System.out.println(""+10+20+30); //"102030"

		int age = 37;
		System.out.println("age="); //age=
		System.out.println(age);    //37
		System.out.println("age="+age); //age=37
		System.out.println("我的年龄是:"+age);
		System.out.println("我今年"+age+"岁了");




        /*
         * 4.赋值运算符:
         *   1)简单赋值运算符:=
         *   2)扩展赋值运算符:+=,-=,*=,/=,%=
         */
		/*
		int a = 5;
		a += 10; //a=a+10
		System.out.println(a); //15
		a *= 2; //a=a*2
		System.out.println(a); //30
		a /= 6; //a=a/6
		System.out.println(a); //5
		*/

        /*
         * 3.逻辑运算符:
         *   1)&&:短路与(并且)，两边都为真则为真，见false则false
         *        第1个数为false时，发生短路(后面的不执行了)
         *     ||:短路或(或者)，有一边为真则为真，见true则true
         *        第1个数为true时，发生短路(后面的不执行了)
         *      !:逻辑非(取反)，非真则假，非假则真
         *   2)逻辑运算是建立在关系运算的基础之上的
         *     逻辑运算的结果也是boolean型
         */

		/*
		int a=5,b=10,c=5;
		boolean b4 = a<b || c++>2;
		System.out.println(b4); //true
		System.out.println(c);  //5，发生短路了
		*/
		/*
		boolean b3 = a>b && c++>2;
		System.out.println(b3); //false
		System.out.println(c);  //5，发生短路了
		*/

		/*
		boolean b2 = !(a>b);
		System.out.println(b2);     //!false=true
		System.out.println(!(a<b)); //!true=false

		System.out.println(a>=b || c<b); //false||true=true
		System.out.println(c<=b || a>b); //true||false=true
		System.out.println(a!=b || c<b); //true||true=true
		System.out.println(a==b || c>b); //false||false=false

		boolean b1 = a>=b && c<b;
		System.out.println(b1);          //false&&true=false
		System.out.println(c<=b && a>b); //true&&false=false
		System.out.println(a==b && c>b); //false&&false=false
		System.out.println(a!=b && c<b); //true&&true=true
		*/







        /*
         * 2.关系运算符:
         *   1)>(大于),<(小于)
         *     >=(大于或等于),<=(小于或等于)
         *     ==(等于),!=(不等于)
         *   2)关系运算的结果为boolean型，
         *     关系成立则为true，关系不成立则为false
         */
		/*
		int a=5,b=10,c=5;
		boolean b1 = a>b;
		System.out.println(b1);   //false
		System.out.println(c<b);  //true
		System.out.println(a>=c); //true
		System.out.println(a<=b); //true
		System.out.println(a==c); //true
		System.out.println(a!=c); //false
		*/








        /*
         * 1.算术运算符:+,-,*,/,%,++,--
         *   1)%:取模/取余，余数为0即为整除
         *   2)++/--:自增1/自减1，可在变量前也可在变量后
         *     2.1)单独使用时，在前在后无差别
         *     2.2)被使用时，在前在后有差别
         *           a++的值为a
         *           ++a的值为a+1
         */

		/*
		int a=5,b=5;
		//1)输出a--的值5
		//2)a自减1变为4
		System.out.println(a--); //5
		System.out.println(a);   //4
		//1)输出--b的值4
		//2)b自减1变为4
		System.out.println(--b); //4
		System.out.println(b);   //4
		*/

		/*
		int a=5,b=5;
		int c = a++; //1)将a++的值5赋值给c 2)a自增1变为6
		int d = ++b; //1)将++b的值6赋值给d 2)b自增1变为6
		System.out.println(a); //6
		System.out.println(b); //6
		System.out.println(c); //5
		System.out.println(d); //6
		*/

		/*
		int a=5,b=5;
		a++; //相当于a=a+1
		++b; //相当于b=b+1
		System.out.println(a); //6
		System.out.println(b); //6
		*/

		/*
		System.out.println(5%2); //1
		System.out.println(8%2); //0
		System.out.println(2%8); //2
		*/
    }
}
