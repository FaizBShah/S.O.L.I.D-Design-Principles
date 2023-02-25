package org.example.singleresponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountNumber(123);
        account.setFirstName("Faiz");
        account.setTotalAmount(BigDecimal.valueOf(100000));

        AccountOperations accountOperations = new AccountOperations();

        accountOperations.addAccount(account);

        System.out.println(account.getTotalAmount());

        TransactionOperations transactionOperations = new TransactionOperations(accountOperations);

        transactionOperations.deposit(BigDecimal.valueOf(50000), 123);

        System.out.println(account.getTotalAmount());
    }
}
