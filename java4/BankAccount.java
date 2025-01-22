public class BankAccount {
    // Attributes (Fields)
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase the balance by the deposit amount
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Decrease the balance by the withdrawal amount
            System.out.println("Withdrawn: $" + amount);
        } else {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Withdrawal amount must be greater than 0.");
            }
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of $1000
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.00);

        // Display account details
        account.displayAccountInfo();

        // Deposit $500
        account.deposit(500.00);
        
        // Withdraw $200
        account.withdraw(200.00);
        
        // Try withdrawing more than the balance
        account.withdraw(1500.00);

        // Display account details after transactions
        account.displayAccountInfo();
    }
}
