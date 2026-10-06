public class BankAccount {
    String accountName;
    int accountNumber;
    double balance;
    BankAccount(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayBankAccount() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    void checkBalance() {
        if (balance >= 1000) {
            System.out.println("Balance is sufficient.");
        } else {    
            System.out.println("Balance is insufficient.");
        }
    }
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount("Dogo", 12345, 1500.0);
            account1.displayBankAccount();
            account1.checkBalance();

            BankAccount account2 = new BankAccount("Denno Mfupi", 67890, 500.0);
            account2.displayBankAccount();
            account2.checkBalance();
        }
}
