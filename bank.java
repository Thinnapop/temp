
import java.util.Date;

public class bank {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public bank(){
        dateCreated = new Date();
        balance = 0;
        annualInterestRate = 0;
    }
    public bank(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public void setId(){
        this.id = id;
    }
    public void setBalance(){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public Date getDate(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Can't withdraw!!!");
        }
        else{
            balance -= amount;
        }
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Can not deposit!!!");
        } else {
            balance += amount;
        }
    }
    public String toString(){
        return "ID: "+id + "\n"+"Your current Balance"+getBalance();
    }
}
