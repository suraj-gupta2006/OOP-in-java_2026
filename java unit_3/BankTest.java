class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        System.out.println("suraj gupta");
        BankAccount acc = new BankAccount();
        acc.accountNumber = "A001";
        acc.holderName = "Suraj";
        acc.balance = 50000;
        acc.display();
        acc.deposit(15000);
        acc.withdraw(20000);
        acc.display();
        System.out.println("suraj gupta");
    }
}