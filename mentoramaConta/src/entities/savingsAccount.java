package entities;

public class savingsAccount extends Account
{

    private double taxsFee;
    private int Birth;

    public savingsAccount(){
        super();
    }

    public savingsAccount(double taxsFee, int birth) {
        this.taxsFee = taxsFee;
        Birth = birth;
    }

    public savingsAccount(String banco, Integer agencia, Integer numero, double saldo, double taxsFee, int birth) {
        super(banco, agencia, numero, saldo);
        this.taxsFee = taxsFee;
        Birth = birth;
    }

    public double getTaxsFee() {
        return taxsFee;
    }

    public void setTaxsFee(double taxsFee) {
        this.taxsFee = taxsFee;
    }

    public int getBirth() {
        return Birth;
    }

    public void setBirth(int birth) {
        Birth = birth;
    }

    @Override
    public double getSaldo() {
            return this.saldo + this.taxsFee * saldo;
        }

    @Override
    public String toString() {
        return "savingsAccount:" +
                "taxsFee=" + taxsFee +
                ", Birth=" + Birth +
                ", saldo=" + String.format("%.2f", saldo) +
                '.';
    }
}
