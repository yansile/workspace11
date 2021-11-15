package Dome;

import java.util.Arrays;
import java.util.Scanner;

//22、任意提供的一个一维数组，对其中的元素进行从大到小或者从小到大的排序。
public class Dome22 {
    public static void main(String[] args) {
        int[] sum = new int[7];
        Scanner sc  = new Scanner(System.in);

        for (int i = 0; i <7 ; i++) {
            sum[i]=sc.nextInt();
        }
        Arrays.sort(sum);
        for (int i = 0; i <7 ; i++) {
            System.out.println(sum[i]);
        }

    }
}
