public class Q5 {
    public static void main(String[] args) {
        BankDemo b1 = new BankDemo(772702, 2000);
        try {
            b1.addFund(2000);
            b1.withdraw(5000);
        } catch (InsufficientBalance e) {
            System.out.println("Error caught:- " + e.getMessage());
        }
    }
}

class BankDemo {
    int AccountNo;
    double balance;

    BankDemo(int AccountNo, double balance) {
        this.AccountNo = AccountNo;
        this.balance = balance;
    }

    void addFund(int amount) {
        System.out.println(amount + " is credited to " + AccountNo + " balance : $" + (amount + balance));
    }

    void withdraw(int amount) throws InsufficientBalance {
        if (balance < amount) {
            throw new InsufficientBalance("Insufficient balance");
        }
        System.out.println(amount + " is debited to " + AccountNo + " balance : $" + (balance - amount));
    }
}

class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}

// output
// 2000 is credited to 772702 balance : $4000.0
// Error caught:- Insufficient balance