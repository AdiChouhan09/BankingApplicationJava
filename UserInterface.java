import java.util.Scanner;

public class UserInterface {
    private static final int MAX_ACCOUNTS = 100;
    private final Account[] accounts = new Account[MAX_ACCOUNTS];
    private int accountCount = 0;
    private int nextAccountNumber = 1001;
    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new UserInterface().mainMenu();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\nWelcome to the Banking Application!");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = readInt();
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performDeposit();
                case 3 -> performWithdrawal();
                case 4 -> showAccountDetails();
                case 5 -> updateContact();
                case 6 -> {
                    System.out.println("Thank you for banking with us. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please select 1-6.");
            }
        }
    }

    public void createAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Bank is at capacity. Cannot create more accounts.");
            return;
        }

        System.out.print("Enter account holder name: ");
        String name = readNonEmptyLine();

        double initialDeposit;
        while (true) {
            System.out.print("Enter initial deposit amount: ");
            initialDeposit = readDouble();
            if (initialDeposit < 0) {
                System.out.println("Initial deposit cannot be negative.");
            } else
                break;
        }

        String email;
        while (true) {
            System.out.print("Enter email address: ");
            email = sc.nextLine().trim().toLowerCase();
            if (isValidEmail(email))
                break;
            System.out.println("Invalid email format. Try again.");
        }

        String phone;
        while (true) {
            System.out.print("Enter phone number : ");
            phone = sc.nextLine().trim();
            if (isValidPhone(phone))
                break;
            System.out.println("Invalid phone number.");
        }

        Account acc = new Account(nextAccountNumber, name, initialDeposit, email, phone);
        accounts[accountCount++] = acc;
        System.out.println("Account created successfully with Account Number: " + nextAccountNumber);
        nextAccountNumber++;
    }

    public void performDeposit() {
        Account acc = findAccountByPrompt();
        if (acc == null)
            return;
        System.out.print("Enter amount to deposit: ");
        double amount = readDouble();
        acc.deposit(amount);
    }

    public void performWithdrawal() {
        Account acc = findAccountByPrompt();
        if (acc == null)
            return;
        System.out.print("Enter amount to withdraw: ");
        double amount = readDouble();
        acc.withdraw(amount);
    }

    public void showAccountDetails() {
        Account acc = findAccountByPrompt();
        if (acc != null)
            acc.displayAccountDetails();
    }

    public void updateContact() {
        Account acc = findAccountByPrompt();
        if (acc == null)
            return;

        String email;
        while (true) {
            System.out.print("Enter new email: ");
            email = sc.nextLine().trim().toLowerCase();
            if (isValidEmail(email))
                break;
            System.out.println("Invalid email format. Try again.");
        }

        String phone;
        while (true) {
            System.out.print("Enter new phone: ");
            phone = sc.nextLine().trim();
            if (isValidPhone(phone))
                break;
            System.out.println("Invalid phone number.");
        }

        acc.updateContactDetails(email, phone);
    }

    private Account findAccountByPrompt() {
        System.out.print("Enter account number: ");
        int accNo = readInt();
        Account acc = findAccount(accNo);
        if (acc == null)
            System.out.println("Account not found.");
        return acc;
    }

    private Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber)
                return accounts[i];
        }
        return null;
    }

    private int readInt() {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    private double readDouble() {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    private String readNonEmptyLine() {
        while (true) {
            String s = sc.nextLine().trim();
            if (!s.isEmpty())
                return s;
            System.out.print("Input cannot be empty. Try again: ");
        }
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,10}$");
    }

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\d{10,15}$");
    }
}
