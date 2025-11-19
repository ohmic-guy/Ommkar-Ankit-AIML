class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg){
        super(msg);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(int amt) {
        balance += amt;
        System.out.println("Amount Deposited! New Balance: " + balance);
    }

    void withdraw(int amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Withdrawal denied! Balance cannot go below ₹500.");
        }
        balance -= amt;
        System.out.println("Amount Withdrawn! New Balance: " + balance);
    }

    void transfer(Account acc1, Account acc2, int amt) throws MinimumBalanceException {
        if (acc1.balance - amt < 500) {
            throw new MinimumBalanceException("Transfer denied! Sender cannot go below ₹500.");
        }
        acc1.balance -= amt;
        acc2.balance += amt;

        System.out.println("Transfer Successful!");
        System.out.println(acc1.name + " New Balance: " + acc1.balance);
        System.out.println(acc2.name + " New Balance: " + acc2.balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account a1 = new Account("Rahul", 101, 2000);
        Account a2 = new Account("Rita", 102, 1000);

        try {
            a1.withdraw(1500); 
            a1.transfer(a1, a2, 500);

        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}