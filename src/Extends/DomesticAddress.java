package Extends;
//国内地址的格式为：邮政编码、国家、 省、城市、街道名，
public class DomesticAddress extends Address {
    public DomesticAddress(){}
    public String display(){
        return num+","+country+s+cs+jd;
    }

}
