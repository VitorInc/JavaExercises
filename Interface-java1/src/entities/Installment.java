package entities;

import java.util.Date;

public class Installment {
    private Date duDate;
    private Double amount;
    public Installment() {}

    public Installment(Date duDate, Double amount) {
        this.duDate = duDate;
        this.amount = amount;
    }

    public Date getDuDate() {
        return duDate;
    }

    public void setDuDate(Date duDate) {
        this.duDate = duDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
