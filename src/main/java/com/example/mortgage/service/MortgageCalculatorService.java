package com.example.mortgage.service;

import com.example.mortgage.model.MortgageRequest;
import com.example.mortgage.model.MortgageResponse;
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
        double propertyTaxPerMonth = request.getPropertyTaxPerYear() / 12;
        double homeInsurancePerMonth = request.getHomeInsurancePerYear() / 12;
        double hoaPerMonth = request.getHoaPerMonth();

        double totalMonthlyPayment = monthlyPrincipalAndInterest + monthlyPmi + propertyTaxPerMonth + homeInsurancePerMonth + hoaPerMonth;

        return new MortgageResponse(
                loanAmount,
                monthlyPrincipalAndInterest,
                monthlyPmi,
                propertyTaxPerMonth,
                homeInsurancePerMonth,
                hoaPerMonth,
                totalMonthlyPayment
        );
    }
}
