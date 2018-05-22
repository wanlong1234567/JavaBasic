package com.wanlong.day05;

/**
 * @author wanlong
 * Date:2018/5/22
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*
         * 1)声明整型数组arr，包含10个元素
         *   遍历arr，对每个元素赋值为0到99之间的随机数
         *   遍历arr，输出每个元素的值
         * 2)冒泡算法对arr进行升序排列
         * 3)遍历arr，输出排序后的数据
         */
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){ //控制轮
            for(int j=0;j<arr.length-1-i;j++){ //控制次
                if(arr[j]>arr[j+1]){ //每次都和它下一个元素比
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("排序后:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
