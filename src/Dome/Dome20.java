package Dome;

import java.util.Scanner;
//20、 编写程序，把由 10 个元素组成的一维数组逆序存放再输出。
public class Dome20 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("请输入10个数字：");
        int[] sum = new int[10];
        int[] num = new int[10];
        for (int i= 0 ; i<10;i++){
            sum[i]=sc.nextInt();
        }
        int j=0;
        for (int i=sum.length-1;i>=0;i--,j++){
            num[j]=sum[i];
            System.out.print(num[j]);
        }
    }
}
