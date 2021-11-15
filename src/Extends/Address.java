package Extends;

//1、定义一个Address地址类，为Address派生出InternationalAddress国际地址类和DomesticAddress国内地址类，
// 在Address类中定义display()方法显示Address类的各属性。
//国内地址的格式为：邮政编码、国家、 省、城市、街道名，
//国外地址的格式为：街道名、城市、省、国家、邮政编码。
public class Address {
    public int num;
    public String country;
    public String s;
    public String cs;
    public String jd;

    public Address(){

    }
    public Address(int num, String country,String s,String cs,String jd ){
        this.country=country;
        this.cs=cs;
        this.jd = jd;
        this.num=num;
        this.s=s;

    }


    public String display() {
        return "Address{" +
                "num=" + num +
                ", country='" + country + '\'' +
                ", s='" + s + '\'' +
                ", cs='" + cs + '\'' +
                ", jd='" + jd + '\'' +
                '}';
    }
}
