package EXERCICIO;

public class Object {
    private int accNmbr;
    private String accHldr;
    private double initVal;

    public Object(int accNmbr, String accHldr){
        this.accHldr = accHldr;
        this.accNmbr = accNmbr;

    }
    public Object(int accNmbr, String accHldr, double initVal){
        this.accHldr = accHldr;
        this.accNmbr = accNmbr;
        deposit(initVal);
    }

    public int getAccNmbr() {
        return accNmbr;
    }

    public String getAccHldr() {
        return accHldr;
    }

    public void setAccHldr(String accHldr) {
        this.accHldr = accHldr;
    }

    public double getInitVal() {
        return initVal;
    }

    public void deposit(double amount){
        initVal += amount;
    }
    public void withDraw(double amount){
        initVal -= amount + 5.0;
    }
    public String toString(){
        return "Acc "
                + accNmbr
                +", Holder "
                +accHldr
                +", Balance: $ "
                +String.format("%2f.n",initVal);
    }

}