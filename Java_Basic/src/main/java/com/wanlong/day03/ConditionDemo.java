package com.wanlong.day03;

/**
 * @author wanlong
 * Date:2018/5/22
 * 分支结构演示
 */
public class ConditionDemo {
    public static void main(String[] args) {
        int num = 4;
        switch (num) { //byte,short,int,char
            case 1: //相当于if(num==1)
                System.out.println(111);
                break;
            case 2: //以此为入口
                System.out.println(222);
                break; //跳出switch
            case 3:
                System.out.println(333);
                break;
            default: //所有case都未匹配时执行
                System.out.println(666);
        }
    }
}
