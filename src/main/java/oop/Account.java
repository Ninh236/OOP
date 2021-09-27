package oop;

import java.util.ArrayList;

public class Account {
    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                balance -= amount;
            }
        }
    }

    /**
     * add transaction to the transitionList.
     *
     * @param amount changes amount
     * @param operation type of transaction
     */
   public void addTransaction(double amount, String operation) {
        if (operation.equalsIgnoreCase(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            if (operation.equalsIgnoreCase(Transaction.WITHDRAW)) {
                withdraw(amount);
            } else {
                System.out.println("Yeu cau khong hop le!");
                return;
            }
        }
        transitionList.add(new Transaction(operation, amount, balance));
    }

    /**
     * print transactions history.
     *
     */
    public void printTransaction() {
        String operation = new String();
        double amount = 0;
        double currentBalance = 0;

        for (int i = 0; i < transitionList.size(); i++) {
            operation = transitionList.get(i).getOperation();

            amount = transitionList.get(i).getAmount();
            amount = (double) Math.round(amount * 100) / 100;

            currentBalance = transitionList.get(i).getBalance();
            currentBalance = (double) Math.round(currentBalance * 100) / 100;

            if (operation.equalsIgnoreCase(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. ", i + 1, amount);
                System.out.printf("So du luc nay: $%.2f.\n", currentBalance);
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. ", i + 1, amount);
                System.out.printf("So du luc nay: $%.2f.\n", currentBalance);
            }
        }
    }
}
