package com.wanlong.day04;

/**
 * @author wanlong
 * Date:2018/5/22
 * for循环演示
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int num=1;num<=100;num++){
            //1到100的累加和，只要个位不得3的
            if(num%10!=3){
                sum = sum+num;
            }
        }
        System.out.println("sum="+sum);


		/*
		int sum = 0;
		for(int num=1;num<=100;num++){
			//1到100的累加和，跳过个位为3的
			if(num%10==3){
				continue;
			}
			sum = sum+num;
		}
		System.out.println("sum="+sum);
		*/
        /*
         *       sum=0
         * num=1 sum=1
         * num=2 sum=1+2
         * num=3
         * num=4 sum=1+2+4
         * ...
         * num=13
         */







		/*
		int sum = 0;
		for(int num=1;num<=100;num++){
			if(sum>=4000){ //在某种情况下才break
				break;
			}
			sum = sum+num;
		}
		System.out.println("sum="+sum);
		*/



		/*
		int sum = 0;
		int num=1;
		for(;num<=100;num++){
			sum = sum+num;
		}
		System.out.println("sum="+sum);
		*/

		/*
		int sum = 0;
		for(int num=1;num<=100;){
			sum = sum+num;
			num++;
		}
		System.out.println("sum="+sum);
		*/

		/*
		for(;;){ //死循环
			System.out.println("我要学习...");
		}
		*/

		/*
		for(int i=0,j=6;i<5;i+=2,j-=2){
		}
		*/
        /*
         * i=0,j=6
         * i=2,j=4
         * i=4,j=2
         * i=6,j=0
         */




		/*
		//累加和:1+2+3+4+...+99+100=?
		int sum = 0; //和
		for(int num=1;num<=100;num++){
			sum = sum+num;
		}
		System.out.println("sum="+sum);
		*/
        /*
         *       sum=0
         * num=1 sum=1
         * num=2 sum=1+2
         * num=3 sum=1+2+3
         * num=4 sum=1+2+3+4
         * ...
         * num=100 sum=1+2+3+4+...+100
         * num=101 false
         */








		/*
		for(int times=0;times<10;times++){
			System.out.println("行动是成功的阶梯");
		}
		System.out.println("over");

		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		System.out.println("over");
		*/
    }
}
