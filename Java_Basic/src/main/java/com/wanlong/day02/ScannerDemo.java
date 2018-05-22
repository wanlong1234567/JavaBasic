package com.wanlong.day02;

import java.util.Scanner;

/**
 * @author wanlong
 * Date:2018/5/12
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = scan.nextInt();
        System.out.println("请输入价格:");
        double price = scan.nextDouble();

        System.out.println(age);
        System.out.println(price);
    }
}
