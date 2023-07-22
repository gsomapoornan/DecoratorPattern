package org.decorator.loan;

import org.decorator.Loan;

public class AgriLoan implements Loan {
    @Override
    public int getInterestRate() {
        return 10;
    }
}
