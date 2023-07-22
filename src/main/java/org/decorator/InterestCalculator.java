package org.decorator;

import org.decorator.category.MenCatogary;
import org.decorator.category.SeniorCatogary;
import org.decorator.category.VetaranCatogary;
import org.decorator.category.WomenCatogary;
import org.decorator.loan.AgriLoan;
import org.decorator.loan.AgriSectorLoan;

public class InterestCalculator {

    public static void main(String[] args) {
        Loan myAgriLoan=new MenCatogary(new AgriLoan());
        System.out.println("my agriloan"+myAgriLoan.getInterestRate() );
        Loan myAgriLoanSeniorVetaran=new VetaranCatogary(new SeniorCatogary(new MenCatogary(new AgriLoan())));
        System.out.println("myAgriLoanSeniorVetaran"+myAgriLoanSeniorVetaran.getInterestRate());
        Loan myWiftAgriSectorLoan=new WomenCatogary(new AgriSectorLoan());
        System.out.println("myWiftAgriSectorLoan"+myWiftAgriSectorLoan.getInterestRate());
    }

}
