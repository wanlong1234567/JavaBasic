package com.wanlong.day04;

/**
 * @author wanlong
 * Date:2018/5/22
 * while循环演示
 */
public class WhileDemo {
    public static void main(String[] args) {
        /*
         * while的练习:
         * 1)输出10次"行动是成功的阶梯"
         * 2)输出9的乘法表:
         *   2.1)正序:1到9
         *   2.2)倒序:9到1
         *   2.3)奇数:1,3,5,7,9
         * 3)任选其一写执行过程
         */

		int num = 1;
		while(num<=9){
			System.out.println(num+"*9="+num*9);
			num++;
		}
		System.out.println("over");



		/*
		int num = 9;
		while(num>=1){
			System.out.println(num+"*9="+num*9);
			num-=2;
		}
		*/



		int times = 0;   //1.循环变量的初始化
		while(times<10){ //2.循环的条件
			System.out.println("行动是成功的阶梯");
			times++;     //3.循环变量的改变
		}
        System.out.println(times);
		System.out.println("over");

        /*
         *          times=0
         * true 输出 times=1
         * true 输出 times=2
         * true 输出 times=3
         * true 输出 times=4
         * true 输出 times=5
         * true 输出 times=6
         * true 输出 times=7
         * true 输出 times=8
         * true 输出 times=9
         * true 输出 times=10
         * false while循环结束
         * 输出over
         */
    }
}
