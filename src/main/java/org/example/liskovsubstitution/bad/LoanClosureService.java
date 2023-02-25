package org.example.liskovsubstitution.bad;

public class LoanClosureService {

    private final LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    // This method will fail if loanPayment
    // has CreditCardLoan Implementation.
    // Hence, bad practice.
    public void forceCloseLoan() {
        loanPayment.forceCloseLoan();
    }
}
