package Dome;

import java.util.Scanner;

public class Dome8 {
    public static void main(String[] args) {
//、编写一个程序,对输入的 4 个整数,求出其中最大值和最小值    }
        System.out.println("输入的 4 个整数,求出其中最大值和最小值 ");
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
        int[] num1 = new int[4];
        for (int i = 0; i <= 3; i++) {
            System.out.println("请输入第"+(i+1)+"个整数 ");
            num1[i] = sc.nextInt();
        }
        mabao(num1);
        System.out.println("最小的数："+num1[0]+"最大的数"+num1[3]);
    }
        private static void mabao(int []i) {
            int team=0;//定义一个变量
            //循环从零开始条件以小于数组的长度每循环一次定以的循环变化一次
            for(int k=0;k<i.length;k++){
                //循环从零开始条件小于数组的长度减去外增循环的大小
                for(int j=0;j<i.length-k;j++){
                    //判断
                    if(i[k]>i[k+j]){
                        //
                        team=i[k];
                        i[k]=i[k+j];
                        i[k+j]=team;
                    }
                }
            }
            for(int k=0;k<i.length;k++){
                System.out.print(i[k]+"\t");
            }

    }



}
