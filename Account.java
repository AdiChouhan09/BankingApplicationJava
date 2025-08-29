public class Account {
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, String accountHolderName, double initialDeposit,
            String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive. Deposit cancelled.");
            return;
        }
        balance += amount;
        System.out.printf("%.2f deposited successfully. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive. Withdrawal cancelled.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
            return;
        }
        balance -= amount;
        System.out.printf("₹%.2f withdrawn successfully. New balance: ₹%.2f%n", amount, balance);
    }

    public void displayAccountDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolderName);
        System.out.printf("Balance        : %.2f%n", balance);
        System.out.println("Email          : " + email);
        System.out.println("Phone          : " + phoneNumber);
        System.out.println("--------------------------------------------------");
    }

    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated successfully.");
    }
}
