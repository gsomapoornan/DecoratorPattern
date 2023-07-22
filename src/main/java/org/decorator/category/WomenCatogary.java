package org.decorator.category;

import org.decorator.Loan;

public class WomenCatogary implements Loan {
    public WomenCatogary(Loan loan) {
        this.loan = loan;
    }

    Loan loan;
    @Override
    public int getInterestRate() {
        return this.loan.getInterestRate()+0;
    }
}
