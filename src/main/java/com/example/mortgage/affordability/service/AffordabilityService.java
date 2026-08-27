package com.example.mortgage.affordability.service;

import com.example.mortgage.affordability.model.AffordabilityResponse;
import com.example.mortgage.mortgage.model.MortgageResponse;
import com.example.mortgage.savings.model.SavingsResponse;
import org.springframework.stereotype.Service;

@Service
public class AffordabilityService {

    public AffordabilityResponse calculateAffordability(
            MortgageResponse mortgageResponse,
            SavingsResponse savingsResponse
    ) {
        double amountNeeded = mortgageResponse.downPayment() - savingsResponse.availableSavings();

        double monthlySavings = savingsResponse.monthlyProjectedSavings();

        int totalMonthsToSavingComplete = 0;

        if (amountNeeded > 0 && monthlySavings > 0) {
            totalMonthsToSavingComplete =
                    (int) Math.ceil(amountNeeded / monthlySavings);
        }

        int yearsToSavingComplete = totalMonthsToSavingComplete / 12;
        int monthsToSavingComplete = totalMonthsToSavingComplete % 12;

        return new AffordabilityResponse(
                mortgageResponse,
                savingsResponse,
                yearsToSavingComplete,
                monthsToSavingComplete
        );
    }
}