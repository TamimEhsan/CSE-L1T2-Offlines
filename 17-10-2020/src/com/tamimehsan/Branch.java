package com.tamimehsan;

import java.util.Arrays;

public class Branch {
    private int id;
    private String name;
    private Account []  accounts;
    private int accountCount;
    private static Branch[] branches;
    private static int branchCount;
    // add your code here
    // there can be at most 20 branches

    // you are not allowed to write any other constructor
    public Branch(int id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new Account[10];
        // add your code here
        if( branches == null ){
            branches = new Branch[10];
        }
        branches[branchCount++] = this;
    }

    public void addAccount(Account a) {
        accounts[accountCount++] = a;
    }

    public double getBranchBalance(){
        double balance = 0;
        for(int i=0;i<accountCount;i++){
            balance+=accounts[i].getBalance();
        }
        return  balance;
    }

    public Account getMinBalanceAccount(){
        int index = 0;
        if( accountCount == 0 ){
            return null;
        }
        double minBalance = accounts[0].getBalance();
        for(int i=1;i<accountCount;i++){
            if( minBalance>accounts[i].getBalance() ){
                index = i;
                minBalance = accounts[i].getBalance();
            }
        }
        return accounts[index];
    }

    public static void transferBalance(Account from, Account to, double balance){
        from.setBalance(from.getBalance()-balance);
        to.setBalance(to.getBalance()+balance);
    }
    public void getBranchInfo(){
        System.out.println("Branch Id: "+id+", Branch Name: "+name);
        for(int i=0;i<accountCount;i++){
           // System.out.println("Account Number "+(i+1));
            accounts[i].getAccountInfo();
        }
    }
    public static void printAllBranchesInfo(){
        for(int i=0;i<branchCount;i++){
            branches[i].getBranchInfo();
            //System.out.println(branches[i]);
        }
    }

    // add your code here

    @Override
    public String toString() {
        return "Branch id=" + id +
                ", name='" + name + '\n' +
                  Arrays.toString(accounts) +
                '\n';
    }
}
