package BankManagement;

public abstract class Account {
    abstract void checkBalance();

    abstract int withdrawal(int withdraw);

    abstract int deposit(int deposit);

}
