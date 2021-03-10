package entities;
public class CheckingAccount extends Account{

private double overdraft;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckingAccount(String banco, Integer agencia, Integer numero, double saldo, double overdraft) {
        super(banco, agencia, numero, saldo);
        this.overdraft = overdraft;
    }

    public double getSaldo() {
        return this.overdraft + this.saldo;
    }

    @Override
    public String toString() {
        return "CheckingAccount: " +
                "overdraft: " + overdraft +
                ", saldo: " + String.format("%.2f", saldo) +
                '.';
    }
}
