package org.example.liskovsubstitution.good;

public class LoanClosureService {

    private final SecureLoanPayment secureLoanPayment;

    public LoanClosureService(SecureLoanPayment secureLoanPayment) {
        this.secureLoanPayment = secureLoanPayment;
    }

    // This method will always work
    // as only classes who have implemented
    // SecureLoanPayment have the forceCloseLoan() method
    public void forceCloseLoan() {
        secureLoanPayment.forceCloseLoan();
    }
}
