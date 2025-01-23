

public class Loan {
    protected double amount;
    protected String name;

    public Loan(){

    }
    public Loan(String name,double amount){
        this.name = name;
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Loan amount: $"+amount;
    }
}
        
    

