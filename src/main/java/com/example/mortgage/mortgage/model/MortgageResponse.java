package com.example.mortgage.mortgage.model;

public record MortgageResponse(
        double downPayment,
        double loanAmount,
        double monthlyPrincipalAndInterest,
        double monthlyPmi,
        double monthlyPropertyTax,
        double monthlyHomeInsurance,
        double monthlyHoa,
        double totalMonthlyPayment) {
}
