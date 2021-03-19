package Application;

import modelEntities.Reserva;
import modelException.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Digite o número da reserva");

            int numero = in.nextInt();

            System.out.println("Digit data de check in:");

            Date checkIn = sdf.parse(in.next());

            System.out.println("Digite data de check out:");

            Date checkOut = sdf.parse(in.next());

            Reserva reserva = new Reserva(numero, checkIn,checkOut);

            System.out.println(reserva);

            System.out.println();

            System.out.println("Atualização da reserva:");

            System.out.println("Digit a nova data de check in:");

            checkIn = sdf.parse(in.next());

            System.out.println("Digite a nova data de check out:");

            checkOut = sdf.parse(in.next());

            reserva.updateDates(checkIn,checkOut);
            System.out.println(reserva);

        }
            catch (ParseException e) {
                System.out.println("erro");
        }
            catch (DomainException e) {
                System.out.println("erro" + e.getMessage());
        }
            catch (RuntimeException e) {
                System.out.println("ERROR");
        }
        in.close();
    }
}
