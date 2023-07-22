package org.decorator.category;

import org.decorator.Loan;

public class SeniorCatogary implements Loan {

    public SeniorCatogary(Loan loan) {
        this.loan = loan;
    }

    Loan loan;

    @Override
    public int getInterestRate() {
        return this.loan.getInterestRate()-1;
    }
}
