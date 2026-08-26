package com.example.mortgage.service;

import com.example.mortgage.model.MortgageRequest;
import org.springframework.stereotype.Service;

@Service
public class MortgageCalculatorService {
    public double calculateMonthlyPayment(MortgageRequest request) {

        double loanAmount = request.getHomePrice() - request.getDownPayment();
        double monthlyInterestRate = request.getInterestRate() / 100 / 12;
        int numberOfPayments = request.getLoanTermYears() * 12;

        return loanAmount *
            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
            / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

    }
}
