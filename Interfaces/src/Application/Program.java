package Application;

import model.entities.CarRental;
import model.entities.Vehicule;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter rental data:");
        System.out.print("Car model:");
        String CarModel = in.nextLine();
        Vehicule veiculo = new Vehicule(CarModel);
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(in.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(in.nextLine());

        CarRental cr = new CarRental(start,finish,veiculo);

        System.out.print("Enter the price per hour: ");
        double pricePerHour = in.nextDouble();
        System.out.println("Entr price pr day: ");
        double pricePerDay = in.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());
        rentalServices.processInvoice(cr);

        System.out.println("Basic payment: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Tax payment: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f",cr.getInvoice().getTotalPayement()));



        in.close();
    }
}
