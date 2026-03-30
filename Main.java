public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Aaima", 0.0);
        BankAccount account2 = new BankAccount("Eman", 1000.0);

        System.out.println("\n Account 2 Initial Transactions ");
        account2.deposit(2000);
        account2.withdraw(200);
        account2.displayAccountInfo();

        System.out.println("\n Account 1 Initial Transactions ");
        account1.withdraw(-100);
        account1.withdraw(50);
        account1.displayAccountInfo();

        System.out.println("\n Account 1 Final Info ");
        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Final Balance: " + account1.getBalance());

        System.out.println("\n Account 2 Final Info ");
        System.out.println("Account Holder: " + account2.getAccountHolder());
        System.out.println("Final Balance: " + account2.getBalance());
    }
}