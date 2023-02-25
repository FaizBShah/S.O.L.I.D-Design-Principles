package org.example.liskovsubstitution.bad;

// The Liskov Substitution Principle states that
// subclasses should be substitutable for their base classes.
// This means that, given that class B is a subclass of class A,
// we should be able to pass an object of class B to any method
// that expects an object of class A and the method should not
// give any weird output in that case.
public class Main {
    public static void main(String[] args) {
        LoanClosureService homeLoanClosureService = new LoanClosureService(new HomeLoan());
        LoanClosureService creditCardLoanClosureService = new LoanClosureService(new CreditCardLoan());

        // This method will work fine
        homeLoanClosureService.forceCloseLoan();

        // This method will throw an error
        creditCardLoanClosureService.forceCloseLoan();
    }
}
