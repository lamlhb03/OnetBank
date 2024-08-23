package com.onetbank.onetbank.account;

public interface AccountService {
    /**
     * increase the user's balance by amount
     * @param amount the amount to be deposit
     */
    void deposit(double amount);

    /**
     * decrease
     * don't decrease if negative balance
     * @param amount
     */
    void withdraw(double amount);

    /**
     * return user balance
     * @return
     */
    double getBalance();
} 
