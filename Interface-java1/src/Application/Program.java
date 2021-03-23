package Application;

import Service.OnlinePaymentSerivice;
import Service.PaypalService;

public class Program {
    public static void main(String[] args) {
        OnlinePaymentSerivice ps = new PaypalService();
        System.out.println(ps.PaymentFee(200.0));
    }



}
