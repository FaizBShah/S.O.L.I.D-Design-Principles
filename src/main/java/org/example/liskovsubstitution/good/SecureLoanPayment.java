package org.example.liskovsubstitution.good;

public interface SecureLoanPayment extends LoanPayment {
    public void forceCloseLoan();
}
