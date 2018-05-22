package com.wanlong.day05;

/**
 * @author wanlong
 * Date:2018/5/22
 * 数组的演示
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //6.数组的排序:
        int[] arr = {23,56,2,3,75,89,4};
        for(int i=0;i<arr.length-1;i++){ //控制轮
            for(int j=0;j<arr.length-1-i;j++){ //控制次
                if(arr[j]<arr[j+1]){ //每次都和它下一个元素比
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
                //若前数大于后数则交换，保证前数小于后数----升序
                //若前数小于后数则交换，保证前数大于后数----降序
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(i+"+:"+arr[i]);
        }

		/*
		int[] arr = {23,576,3,54,26,7};
		Arrays.sort(arr); //升序
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/

		/*
		//5.数组的复制:
		int[] a = {10,20,30,40,50};
		//数组的扩容(创建了一个新的数组并将源数组的数据复制过去了)
		a = Arrays.copyOf(a,a.length+1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		/*
		int[] a = {10,20,30,40,50};
		//a:源数组
		//a1:目标数组
		//6:目标数组的长度
		int[] a1 = Arrays.copyOf(a,8); //效率低、灵活性差
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/

		/*
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6];
		//a:源数组
		//1:源数组的起始下标
		//a1:目标数组
		//0:目标数组的起始下标
		//4:要复制的元素个数
		System.arraycopy(a,1,a1,0,4); //灵活、效率高
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/


        /*
         * 数组的练习:
         * 1)声明整型数组arr，包含10个元素
         * 2)声明整型数组arr1，并直接初始化为2,5,8,9
         *   声明整型数组arr2，先new再直接初始化为2,5,8,9
         * 3)声明整型数组arr3，包含3个元素
         *     输出arr3的长度
         *     给arr3中的第1个元素赋值为100
         *     给arr3中的第2个元素赋值为200
         *     给arr3中的第3个元素赋值为300
         *     arr3[3] = 400;----------------???
         *     输出arr3中最后一个元素的值(下标不能写死)
         * 4)创建类MaxOfArray，在main()中:
         *   4.1)声明整型数组arr，包含10个元素
         *   4.2)遍历arr，给每个元素赋值为0到99之间的随机数
         *   4.3)遍历arr，输出每个元素的值
         */

		/*
		//4.数组的遍历
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("倒序输出:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		*/

		/*
		//3.数组的访问
		int[] arr = new int[3];
		System.out.println(arr.length); //3
		arr[0] = 100; //给arr中第1个元素赋值为100
		arr[1] = 200;
		arr[2] = 300;
		//arr[3] = 400; //数组下标越界异常
		System.out.println(arr[arr.length-1]); //输出最后一个元素的值
		*/

		/*
		//2.数组的初始化
		int[] arr = new int[4]; //0,0,0,0
		int[] arr1 = {1,4,6,8}; //1,4,6,8
		int[] arr2 = new int[]{1,4,6,8}; //1,4,6,8
		int[] arr3;
		//arr3 = {1,4,6,8}; //编译错误，此方式只能声明同时初始化
		arr3 = new int[]{1,4,6,8}; //正确
		*/

		/*
		//1.数组的声明
		int[] arr = new int[10];
		*/
    }
}
