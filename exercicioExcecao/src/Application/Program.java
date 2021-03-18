package Application;

import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o número da reserva");

        int numero = in.nextInt();

        System.out.println("Digit data de check in:");

        Date checkIn = sdf.parse(in.next());

        System.out.println("Digite data de check out:");

        Date checkOut = sdf.parse(in.next());

        if(!checkOut.after(checkIn)){

            System.out.println("Inválido");

        } else{
            Reserva reserva = new Reserva(numero, checkIn,checkOut);

            System.out.println(reserva);

            System.out.println();

            System.out.println("Atualização da reserva:");

            System.out.println("Digit a nova data de check in:");

            checkIn = sdf.parse(in.next());

            System.out.println("Digite a nova data de check out:");

            checkOut = sdf.parse(in.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error");

            }

            else if(!checkOut.after(checkIn)) {
                System.out.println("Error");
            }
            else {

                reserva.updateDates(checkIn, checkOut);

                System.out.println(reserva);
            }
        }
        in.close();
    }
}
