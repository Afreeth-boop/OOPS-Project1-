package OOPSproject1;

public class Savingsaccount extends Account{
    private double interestRate;
    public Savingsaccount(String accountholder, double balance, double interestRate){
        super(accountholder,balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest(){
        return getBalance()*interestRate/100;
    }

    @Override
    public void showAccountType() {
        System.out.println("Savings Account");
    }
}
