package org.example.liskovsubstitution.bad;

public class HomeLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void forceCloseLoan() {

    }

    @Override
    public void doRepayment() {

    }
}
