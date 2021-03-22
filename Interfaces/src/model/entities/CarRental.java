package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarRental {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date start;
    private Date finish;

   private Vehicule vehicule;
   private Invoice invoice;

   public CarRental() {}

    public CarRental(Date start, Date finish, Vehicule vehicule) {
        this.start = start;
        this.finish = finish;
        this.vehicule = vehicule;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "CaRental{" +
                "start=" + start +
                ", finish=" + finish +
                ", vehicule=" + vehicule +
                ", invoice=" + invoice +
                '}';
    }
}
