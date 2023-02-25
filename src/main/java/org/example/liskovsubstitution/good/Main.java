package org.example.liskovsubstitution.good;

// The Liskov Substitution Principle states that
// subclasses should be substitutable for their base classes.
// This means that, given that class B is a subclass of class A,
// we should be able to pass an object of class B to any method
// that expects an object of class A and the method should not
// give any weird output in that case.
public class Main {
    public static void main(String[] args) {
        LoanClosureService loanClosureService = new LoanClosureService(new HomeLoan());

        // This method will work perfectly fine
        // as only classes which have implemented
        // the SecureLoanPayment interface can
        // be passed in the constructor. So classes
        // which doesn't have forceCloseLoan() method
        // will never be used in this method
        loanClosureService.forceCloseLoan();
    }
}
