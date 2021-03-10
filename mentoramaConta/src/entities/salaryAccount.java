package entities;

public class salaryAccount extends Account {

    private final int WithDrawLimit;
    private int WithDraw;



    public salaryAccount(int withDrawLimit, int withDraw) {
        this.WithDrawLimit = withDrawLimit;
        this.WithDraw = withDraw;
    }

    public salaryAccount(String banco, Integer agencia, Integer numero, double saldo, int withDrawLimit, int withDraw) {
        super(banco, agencia, numero, saldo);
        this.WithDrawLimit = withDrawLimit;
        this.WithDraw = withDraw;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public void withdrawDone(double amount){
        if(WithDrawLimit < WithDraw){
            if(amount <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - amount);
                this.WithDraw++;
                System.out.println("Amount R$" + String.format("%.2f", this.getSaldo()));
            }else System.out.println("Not enought funds to withdraw");
        }else System.out.println("The amount of withdraw is over");
    }

    public String balanceAvailable(){
        return "\n Available: R$"+this.saldo;
    }

    @Override
    public String toString() {
        return "salaryAccount{" +
                "WithDrawLimit=" + WithDrawLimit +
                ", WithDraw=" + WithDraw +
                ", saldo=" + String.format("%.2f", this.getSaldo()) +
                '}';
    }

    public String amountOfWithdrawAvailable(){
        return "\nQuantidade de saques" + String.valueOf(this.WithDraw - this.WithDrawLimit);

    }
}
