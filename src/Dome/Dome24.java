package Dome;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//24、建立一个一维数组，使用该数组列出所学习的课程名称。
public class Dome24 {
    public static void main(String[] args) {
        String[] str = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程名");
        for (int i = 0; i <3 ; i++) {
            str[i]=sc.next();

        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(str[i]);
        }
    }


}
