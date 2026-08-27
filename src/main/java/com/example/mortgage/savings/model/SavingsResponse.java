package com.example.mortgage.savings.model;

public record SavingsResponse(
        double availableSavings,
        double monthlyProjectedSavings,
        double yearlyProjectedSavings
) {}