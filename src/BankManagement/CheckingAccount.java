package BankManagement;

public class CheckingAccount extends Account{
    int balance = 30000;
    @Override
    void checkBalance() {
        System.out.println("Balance on Checking Account " + balance);
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
