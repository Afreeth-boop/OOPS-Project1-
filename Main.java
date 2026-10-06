package OOPSproject1;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Affu", 15000);
        Savingsaccount account1 = new Savingsaccount("Ashu", 10000, 5);
        Account account2 = new CurrentAccount("Aila", 20000);

        System.out.println("Your balance is :"+ account.getBalance());

        account.deposit(1000);

        System.out.println("Balance After deposit :"+account.getBalance());

        account.withDraw(1000);

        System.out.println("Balance After withdraw :"+account.getBalance());

        System.out.println(account1.calculateInterest());

        account1.showAccountType();

        account2.showAccountType();



    }
}
