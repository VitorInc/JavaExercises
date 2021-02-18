package EXERCICIO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Object obj;

        System.out.println("Enter the acc number: ");
        int accNmbr = sc.nextInt();
        System.out.println("Enter the Owners name: ");
        String accHldr = sc.nextLine();
        System.out.println("Is there an initial deposit ? ");
        char response = sc.next().charAt(0);
        double initVal = 0;
        if (response == 'y') {
            System.out.println("Enter the initial value");
            initVal = sc.nextDouble();
            obj = new Object(accNmbr, accHldr, initVal);
        } else {
            obj = new Object(accNmbr, accHldr);
        }
        System.out.println();
        System.out.println("Account data:" );
        System.out.println(obj);

        System.out.println();
        System.out.println("Enter a dposit value");
        double depositVl = sc.nextDouble();
        obj.deposit(depositVl);
        System.out.println("Updated acc data");
        System.out.println(obj);



        sc.close();
    }

}
