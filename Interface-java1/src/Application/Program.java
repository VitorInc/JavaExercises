package Application;

import Service.ContractService;
import Service.OnlinePaymentSerivice;
import Service.PaypalService;
import entities.Contract;
import entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = in.nextInt();
        System.out.println("Date (dd/MM/yyyy): ");
        Date date = null;
        try {
            date = sdf1.parse(in.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Contract value: ");
        double totalValue = in.nextDouble();
        Contract contract = new Contract(number, date, totalValue);

        ContractService cs = new ContractService(new PaypalService());

        System.out.println("Enter the number of Installments");
        int N = in.nextInt();
        cs.processContract(contract, N);

        for(Installment it: contract.getParcelas()){
            System.out.println(it);
        }
        in.close();
    }



}
