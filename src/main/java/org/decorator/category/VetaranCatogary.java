package org.decorator.category;

import org.decorator.Loan;

public class VetaranCatogary implements Loan {

    public VetaranCatogary(Loan loan) {
        this.loan = loan;
    }

    Loan loan;
    @Override
    public int getInterestRate() {
        return this.loan.getInterestRate()-2;
    }
}
