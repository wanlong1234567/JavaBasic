package com.wanlong.day06;

/**
 * @author wanlong
 * Date:2018/5/22
 * 方法的演示
 */
public class MethodDemo {
    public static void main(String[] args) {
        //say();


		//sayHi(); //编译错误，有参则必须传参
		//sayHi(250); //编译错误，参数类型不匹配
		sayHi("zhangsan"); //String name="zhangsan"
		sayHi("lisi"); //String name="lisi"
		sayHi("wangwu");
		sayHi("zhangliu");


		/*
		double a = getNum(); //getNum()的值就是return后的那个值
		System.out.println(a); //8.88
		*/

		/*
		//int b = plus(5,6); //int num1=5,int num2=6
		//System.out.println(b);

		int c=5,d=6;
		int e = plus(c,d); //int num1=5,int num2=6
		System.out.println(e);
		*/

        a(); //方法的嵌套调用

    }

    public static void a(){
        System.out.println(111);
        b();
        System.out.println(222);
    }
    public static void b(){
        System.out.println(333);
    }

    //有参有返回值
    public static int plus(int num1,int num2){
        int num = num1+num2;
        return num; //返回的是num里面的那个数

        //return num1+num2;
    }

    //无参有返回值
    public static double getNum(){
        //return; //编译错误，必须返回一个值
        //return "Hi"; //编译错误，返回值类型不匹配
        return 8.88; //1)结束方法的执行  2)返回结果给调用方
    }

    //有参无返回值
    public static void sayHi(String name){
		/*
		if(){
			return; //1)结束方法的执行
		}
		*/
        System.out.println("大家好，我叫"+name);
    }

    //无参无返回值
    public static void say(){
        System.out.println("大家好，我叫WKJ");
    }
    }


