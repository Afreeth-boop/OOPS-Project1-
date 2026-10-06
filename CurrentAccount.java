package OOPSproject1;

public class CurrentAccount extends Account{

    public CurrentAccount(String accountholder, double balance){
        super(accountholder, balance);

    }

    @Override
    public void showAccountType() {
        System.out.println("Current Account");
    }
}
