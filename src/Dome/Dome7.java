package Dome;

import java.util.Scanner;

public class Dome7 {
//    从键盘上输入 2 个数，找出最大的数；
//    从键盘上输入 3 个数，找出最大的数；
//    从键盘上输入 3 个数，把他们从大到小排列起来；
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("从键盘上输入 2 个数，找出最大的数；");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("最大的数:"+num1);
        }else{
            System.out.println("最大的数"+num2);
        }

        System.out.println("从键盘上输入 3 个数，找出最大的数,并把他们从大到小排列起来");
        int sun1 = sc.nextInt();
        int sun2 = sc.nextInt();
        int sun3 = sc.nextInt();
        if (sun1>sun2&&sun1>sun3&&sun2>sun3){
            System.out.println(sun1+">"+sun2+">"+sun3);
        }else if (sun1>sun2&&sun1>sun3&&sun3>sun2){
            System.out.println(sun1+">"+sun3+">"+sun2);
        }else if (sun2>sun1&&sun2>sun3&&sun1>sun3){
            System.out.println(sun2+">"+sun1+">"+sun3);
        }else if (sun2>sun1&&sun2>sun3&&sun3>sun1){
            System.out.println(sun2+">"+sun3+">"+sun1);
        } else if (sun3>sun1&&sun3>sun2&&sun1>sun2){
            System.out.println(sun3+">"+sun1+">"+sun2);
        } else if (sun3>sun1&&sun3>sun2&&sun2>sun1){
            System.out.println(sun3+">"+sun2+">"+sun1);
        }

    }
}
