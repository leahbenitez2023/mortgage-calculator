package com.example.mortgage.model;

public record MortgageResponse(
        double loanAmount,
        double monthlyPrincipalAndInterest,
        double monthlyPmi,
        double propertyTaxPerMonth,
        double homeInsurancePerMonth,
        double hoaPerMonth,
        double totalMonthlyPayment) {
}
