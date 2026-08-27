package com.example.mortgage.model;

public record MortgageResponse(
        double loanAmount,
        double monthlyPrincipalAndInterest,
        double monthlyPmi,
        double monthlyPropertyTax,
        double monthlyHomeInsurance,
        double monthlyHoa,
        double totalMonthlyPayment) {
}
