package construchor;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AccountText {
    public static void main(String[] args) {
        Account ac =new Account();
        ac.setId(1110);
        ac.setBalance(20000.0);
        ac.setAnnulInterestRate(0.045);
        System.out.println(ac.getId()+"账户余额为；"+ac.getBalance());
        double balance =ac.getBalance();
        double ann  = ac.getAnnulInterestRate();
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i=1;i<=12;i++){
            double num =(balance*ann)/12;
            balance+=num;
            if (i==5) {
                double c = ac.withdraw(i);
                balance = balance-c;
            }
            if (i==7){
                double c = ac.deposit(i);
                balance = balance+c;
            }
            System.out.println("月份"+i+"\t月利息"+df.format(num)+"\t账户余额"+df.format(balance));
        }
    }
}
