package org.example.liskovsubstitution.good;

public class HomeLoan implements LoanPayment, SecureLoanPayment {
    @Override
    public void doPayment() {

    }

    @Override
    public void forceCloseLoan() {

    }
}
