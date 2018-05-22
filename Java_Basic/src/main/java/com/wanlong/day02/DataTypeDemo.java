package com.wanlong.day02;

/**
 * @author wanlong
 * Date:2018/5/12
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        /*
         * 基本类型转换的练习:
         * 1)声明整型变量a并赋值为5
         *   声明长整型变量b并赋值为a
         *   声明整型变量c并赋值为b
         * 2)声明长整型变量d并赋值为100亿
         *     声明整型变量e并赋值为d，输出e
         *   声明浮点型变量f并赋值为5.987
         *     声明整型变量g并赋值为f，输出g
         * 3)声明byte型变量b1并赋值为5
         *   声明byte型变量b2并赋值为6
         *   声明byte型变量b3并赋值为b1+b2
         * 4)输出2+2，输出2+'2'，输出'2'+'2'
         */

		/*
		//基本数据类型间的转换
		int a = 5;
		long b = a; //自动类型转换
		int c = (int)b; //强制类型转换

		long d = 5; //自动类型转换
		double e = 5; //自动类型转换

		long f = 10000000000L;
		int g = (int)f;
		System.out.println(g); //强转有可能发生溢出

		double h = 56.9876;
		int i = (int)h;
		System.out.println(i); //强转有可能丢失精度

		short b1 = 5;
		short b2 = 6;
		short b3 = (short)(b1+b2);

		System.out.println(2+2);     //4
		System.out.println('2'+'2'); //'2'的码50，加上，'2'的码50
		*/


        /*
         * boolean、char的练习:
         * 1)声明布尔型变量b1并赋值为true
         *   声明布尔型变量b2并赋值为false
         *   声明布尔型变量b3并赋值为56------???
         * 2)声明字符型变量c1并赋值为字符男
         *   声明字符型变量c2并赋值为字符m
         *   声明字符型变量c3并赋值为字符8
         *   声明字符型变量c4并赋值为空格符
         *   声明字符型变量c5并赋值为空字符-----???
         *   声明字符型变量c6并赋值为字符男性---???
         * 3)声明字符型变量c7并赋值为65，输出c7
         *   声明字符型变量c8并赋值为'(单引号)，输出c8
         */

		/*
		//5.char:字符型，2个字节
		char c1 = '女'; //声明字符型变量c1并赋值为字符女
		char c2 = 'f';
		char c3 = '6';
		char c4 = ' '; //声明字符型变量c4并赋值为空格符
		//char c5 = 男; //编译错误，字符必须放在单引号中
		//char c6 = ''; //编译错误，必须有一个字符
		//char c7 = '男性'; //编译错误，只能有一个字符

		char c8 = 97; //0到65535之间
		System.out.println(c8); //a

		char c9 = '\'';
		System.out.println(c9); //'
		*/

		/*
		//4.boolean:布尔型，1个字节
		boolean b1 = true; //true为布尔型直接量
		boolean b2 = false; //false为布尔型直接量
		//boolean b3 = 250; //编译错误，布尔型只能存储true和false
		*/

        /*
         * int、long的练习:
         * 1)声明整型变量a并赋值为250
         *   声明整型变量b并赋值为100亿-------???
         *   输出5/2，输出2/5，输出2.0/5
         *   声明整型变量c并赋值为2147483647，
         *     在c本身基础之上增1，输出c
         * 2)声明长整型变量d并赋值为100亿
         *   声明长整型变量e并赋值为10亿*2*10L，输出e
         *   声明长整型变量f并赋值为10亿*3*10L，输出f
         *   声明长整型变量g并赋值为10亿L*3*10，输出g
         *   声明长整型变量h并赋值为
         *      System.currentTimeMillis()，输出h
         * 3)声明浮点型变量i并赋值为3.14
         *   声明浮点型变量j和k，并分别赋值为6.0和4.9
         *     输出j-k
         */

		/*
		//3.double:浮点型，8个字节，很大很大很大
		double pi = 3.14; //3.14为浮点数直接量，默认为double型
		float f = 3.14F; //3.14F为float型直接量

		double a=6.0,b=4.9;
		System.out.println(a-b); //1.0999999999999996
		*/


		/*
		//2.long:长整型，8个字节，很大很大很大
		//long a = 10000000000; //编译错误，100亿默认为int类型，但是超出int范围了
		long b = 10000000000L; //100亿L为长整型的直接量

		long c = 1000000000*2*10L;
		System.out.println(c); //200亿
		long d = 1000000000*3*10L;
		System.out.println(d); //不是300亿
		long e = 1000000000L*3*10;
		System.out.println(e); //300亿

		long f = System.currentTimeMillis();
		System.out.println(f);
		*/

		/*
		//1.int:整型，4个字节，-21个多亿到21个多亿
		int a = 250; //250为整数直接量，默认为int类型
		//int b = 10000000000; //编译错误，100亿默认为int型，但是超出int范围了

		System.out.println(5/2); //2
		System.out.println(8/2); //4
		System.out.println(2/5); //0
		System.out.println(2/5.0); //0.4

		int b = 2147483647; //int的最大值
		b = b+1;
		System.out.println(b); //-2147483648(int的最小值)
		*/
    }
}
