package Dome;

import java.util.Scanner;

public class Dome21 {
    public static void main(String[] args) {
        int[][] sum = new int[4][5];
        int n = 0,m=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("请给二维数组赋值：");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.println(sum[i][j]);
                if (sum[i][j]%2==0){
                    n+=1;
                }else{
                    m+=1;
                }
            }
        }

        System.out.println("奇数有："+n+"偶数有："+m);
    }
}
