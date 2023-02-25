package org.example.liskovsubstitution.bad;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void forceCloseLoan() {
        throw new UnsupportedOperationException("forceCloseLoan() not supported");
    }

    @Override
    public void doRepayment() {
        throw new UnsupportedOperationException("doRepayment() not supported");
    }
}
