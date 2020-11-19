package com.tamimehsan;

public class Account {

    private int number;
    private String customer;
    private double balance;
    // you are not allowed to add any more class variables here

    // you are not allowed to write any other constructor
    public Account(int number, String customer, double balance) {
        this.number = number;
        this.customer = customer;
        this.balance = balance;
    }

    // add your code here

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void getAccountInfo(){
        System.out.println("Account Number: "+number+", Customer Name: "+customer+" Balance: "+balance);
    }

    @Override
    public String toString() {
        return "Account number=" + number +
                ",customer name:" + customer  +
                ", Balance=" + balance +
                '\n';
    }
}
