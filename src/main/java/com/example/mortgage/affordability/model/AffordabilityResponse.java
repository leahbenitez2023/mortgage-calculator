package com.example.mortgage.affordability.model;

import com.example.mortgage.mortgage.model.MortgageResponse;
import com.example.mortgage.savings.model.SavingsResponse;

public record AffordabilityResponse(
        MortgageResponse mortgageResponse,
        SavingsResponse savingsResponse,
        int yearsToSavingComplete,
        int monthsToSavingComplete
) {
}
