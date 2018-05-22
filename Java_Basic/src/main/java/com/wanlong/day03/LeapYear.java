package com.wanlong.day03;

import java.util.Scanner;

/**
 * @author wanlong
 * Date:2018 /5/22
 */
public class LeapYear {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入年份：");
            int year= sc.nextInt();
            boolean flag = (year%4==0 && year%100!=0) || year%400==0;
            String str = flag?year+"闰年":year+"平年";
            System.out.println("str:"+str);

    }
}
