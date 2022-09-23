package BankManagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Account Reservation Application");
        BusinessAccount bness = new BusinessAccount();
        bness.checkBalance();
        bness.deposit(200);
        bness.checkBalance();
        bness.withdrawal(400);
        bness.checkBalance();
    }
}
