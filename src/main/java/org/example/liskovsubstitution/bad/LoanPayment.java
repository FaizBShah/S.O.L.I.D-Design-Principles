package org.example.liskovsubstitution.bad;

public interface LoanPayment {
    public void doPayment(int amount);

    public void forceCloseLoan();

    public void doRepayment();
}