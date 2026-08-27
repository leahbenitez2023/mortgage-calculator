package com.example.mortgage.mortgage.service;

import com.example.mortgage.mortgage.model.MortgageRequest;
import com.example.mortgage.mortgage.model.MortgageResponse;
import org.springframework.stereotype.Service;

@Service
public class MortgageCalculatorService {
    public MortgageResponse calculateMonthlyPayment(MortgageRequest request) {

        double loanAmount = request.getHomePrice() - request.getDownPayment();
        double monthlyInterestRate = request.getInterestRate() / 100 / 12;
        int numberOfPayments = request.getLoanTermYears() * 12;

        double monthlyPrincipalAndInterest = loanAmount *
            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
            / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        double monthlyPmi = (loanAmount * (request.getPmiRate() / 100)) / 12;
        double monthlyPropertyTax = request.getYearlyPropertyTax() / 12;
        double monthlyHomeInsurance = request.yearlyHomeInsurance() / 12;
        double monthlyHoa = request.monthlyHoa();

        double totalMonthlyPayment = monthlyPrincipalAndInterest + monthlyPmi + monthlyPropertyTax + monthlyHomeInsurance + monthlyHoa;

        return new MortgageResponse(
                loanAmount,
                monthlyPrincipalAndInterest,
                monthlyPmi,
                monthlyPropertyTax,
                monthlyHomeInsurance,
                monthlyHoa,
                totalMonthlyPayment
        );
    }
}
