package com.wanlong.day06;

/**
 * @author wanlong
 * Date:2018/5/22
 * 质数
 */
public class HomeWork {
    public static void main(String[] args) {
        int count = 0; //质数的个数-----计数器
        for(int num=2;num<=100;num++){
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++; //质数个数增1
                System.out.print(num+"\t");

                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("count:"+count);

		/*
		int num = 100;
		boolean flag = true; //1.假设是质数
		//for(int i=2;i<num;i++){ //2/3/4/.../98/99
		//for(int i=2;i<=num/2;i++){ //2/3/4/.../49/50
		for(int i=2;i<=Math.sqrt(num);i++){ //2/3/4.../9/10
			if(num%i==0){
				flag = false; //2.修改为不是质数
				break;
			}
		}
		if(flag){ //3.判断得结论 相当于if(flag==true)
			System.out.println(num+"是质数");
		}else{
			System.out.println(num+"不是质数");
		}
		*/


		/*
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}

		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("最小值为:"+min);

		int[] arr1 = new int[arr.length+1];
		System.arraycopy(arr,0,arr1,1,arr.length);
		arr1[0] = min;
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		*/

    }
}
