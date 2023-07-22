package org.decorator.category;

import org.decorator.Loan;

public class MenCatogary implements Loan {
    public MenCatogary(Loan loan) {
        this.loan = loan;
    }

    Loan loan;

    @Override
    public int getInterestRate() {
        return this.loan.getInterestRate()+1;
    }
}
