package com.wanlong.day03;

import java.util.Scanner;

/**
 * @author wanlong
 * Date:2018/5/22
 */
public class AgeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您好，请输入年龄：");
        int age = sc.nextInt();
        System.out.println(age>18&&age<50);
    }
}
