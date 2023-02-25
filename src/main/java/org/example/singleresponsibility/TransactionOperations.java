package org.example.singleresponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

    private final AccountOperations accountOperations;

    public TransactionOperations(AccountOperations accountOperations) {
        this.accountOperations = accountOperations;
    }

    public void deposit(BigDecimal amount, int accountNumber) {
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
