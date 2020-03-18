package com.demo.day1;

/**
 * create cheng 2020/3/18
 */
public class Day1 {
    public static void main(String[] args) {
//        testif();
        testswitch();
    }

    public static void testif(){
        //1.单分支语句
        //if(条件判断){语句块}  -----表示的意义是:如果条件成立那么就执行下面的语句块  否则不执行
        int a=20;
        if (a == 1) {
            System.out.print("a==1");
        }
        //2.双分支语句
//        if(条件判断){  ------------->表示的含义是:如果条件成立的话那么  就执行if后面的语句块
//        条件不成立的话那么就执行else后面的语句块----->不管条件成立与否都要执行一个语句块
//
//        }else{
//
//        }
        if (a == 1) {
            System.out.print("a==1");
        }else {
            System.out.print("a==2");
        }
        //3.多分支语句
//        if(){}else if(){}else if(){}.....[else]{}
//        从上到下来进行判断  如果条件成立那么执行完一个就ok了
        if (a == 1) {
            System.out.print("a==1");
        }else if (a==2){
            System.out.print("a==2");
        }else if (a==3){
            System.out.print("a==3");
        }else {
            System.out.print("其他");
        }
    }

    private static void testswitch() {
//        switch(被比较的数){   //被比较的数一般情况下是个变量
//            // ------------------->如果被比较的数和比较的数相等的话  那么就执行比较成功的数后面的语句
        int a=1;
        switch (a){
            case 1:
                System.out.print("a==1");
                break;
            case 2:
                System.out.print("a==2");
                break;
            case 3:
                System.out.print("a==3");
                break;
        }
    }
}
