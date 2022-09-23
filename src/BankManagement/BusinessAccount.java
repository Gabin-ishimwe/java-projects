package BankManagement;

public class BusinessAccount extends Account{
    int balance=10000;
    @Override
    void checkBalance() {
        System.out.println("Balance on B/ness Account " + balance);
    }

    @Override
    int withdrawal(int withdraw) {
        return balance -= withdraw;
    }

    @Override
    int deposit(int deposit) {
        return balance += deposit;
    }
}
