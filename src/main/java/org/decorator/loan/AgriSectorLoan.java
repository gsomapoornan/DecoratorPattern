package org.decorator.loan;

import org.decorator.Loan;

public class AgriSectorLoan implements Loan {

    @Override
    public int getInterestRate() {
        return 12;
    }
}
