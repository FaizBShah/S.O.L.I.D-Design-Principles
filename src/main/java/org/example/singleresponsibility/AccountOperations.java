package org.example.singleresponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static final Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    // This method should not be in this class, as this
    // class only deals with account-related responsibilities.
    // This method should be shifted to some other class which deals
    // with transactions
    // public void deposit(int amount, int accountNumber) {
    //
    // }
}
