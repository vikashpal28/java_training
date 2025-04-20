public class Q4 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.getAccountNo(12345578);
        b1.getBalance(2500);
        System.out.println("Account No = " + b1.setAccountNo());
        System.out.println("balance = " + b1.setBalance());

    }
}

class BankAccount {
    private int accountNo;
    private double balance;

    void getAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    void getBalance(double balance) {
        this.balance = balance;
    }

    int setAccountNo() {
        return accountNo;
    }

    double setBalance() {
        return balance;
    }
}

// output:-
// Account No = 12345578
// balance = 2500.0