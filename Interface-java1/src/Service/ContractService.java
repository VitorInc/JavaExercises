package Service;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentSerivice onlinePaymentSerivice;

    public ContractService(OnlinePaymentSerivice onlinePaymentSerivice) {
        this.onlinePaymentSerivice = onlinePaymentSerivice;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue()/months;
        for(int i = 1; i< months ;i++){
            double updateQuota = basicQuota + onlinePaymentSerivice.interest(basicQuota, i);
            double fullQuota = updateQuota + onlinePaymentSerivice.PaymentFee(updateQuota);
            Date dueDate = addMonths(contract.getDate(),i);
            contract.getParcelas().add(new Installment(dueDate, fullQuota));
        }
    }
    private Date addMonths(Date date, int N) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
