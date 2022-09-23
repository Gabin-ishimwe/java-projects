package BankManagement;

public class SavingAccount extends Account{
    int balance = 8000;
    @Override
    void checkBalance() {
        System.out.println("Balance on Saving Account "+ balance);
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
