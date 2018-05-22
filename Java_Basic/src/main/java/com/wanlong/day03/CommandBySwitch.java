package com.wanlong.day03;

import java.util.Scanner;

/**
 * @author wanlong
 * Date:2018/5/22
 * 命令解析城西
 */
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能: 1.显示全部记录  2.查询登录记录  0.退出");
        int command = scan.nextInt();

        switch(command){
            case 1:
                System.out.println("显示全部记录");
                break;
            case 2:
                System.out.println("查询登录记录");
                break;
            case 0:
                System.out.println("下次再来吧!");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
