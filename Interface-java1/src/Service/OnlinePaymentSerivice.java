package Service;

public interface OnlinePaymentSerivice {
    double PaymentFee(double amount);
    double interest(double amount,int months);

}
