package Extends;
//1、定义一个Address地址类，为Address派生出InternationalAddress国际地址类和DomesticAddress国内地址类，
// 在Address类中定义display()方法显示Address类的各属性。
//国内地址的格式为：邮政编码、国家、 省、城市、街道名，
//国外地址的格式为：街道名、城市、省、国家、邮政编码。
//国际地址类
public class InternationalAddress extends Address{

    public InternationalAddress(){}

    public String display(){
        return jd+","+cs+","+s+","+country+","+num;
    }


}
