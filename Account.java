package OOPSproject1;

public class Account {
    private String accountholder;
    private double balance;

    public Account(String accountholder, double balance) {
        this.accountholder = accountholder;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance(){
        return balance;
    }

    public void withDraw(double amount){
        if (amount<=balance){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void showAccountType(){
        System.out.println("General Account");
    }
}
