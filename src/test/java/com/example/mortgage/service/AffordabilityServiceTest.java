package com.example.mortgage.service;

import com.example.mortgage.affordability.model.AffordabilityResponse;
import com.example.mortgage.affordability.service.AffordabilityService;
import com.example.mortgage.mortgage.model.MortgageResponse;
import com.example.mortgage.savings.model.SavingsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AffordabilityServiceTest {

    @Test
    void calculateAffordability() {
        // Arrange
        MortgageResponse mortgageResponse = new MortgageResponse(
                50000,     // downPayment
                450000,    // loanAmount
                2844.31,   // monthlyPrincipalAndInterest
                262.50,    // monthlyPmi
                1000,      // monthlyPropertyTax
                416.67,    // monthlyHomeInsurance
                400,       // monthlyHoa
                4923.48    // totalMonthlyPayment
        );

        SavingsResponse savingsResponse = new SavingsResponse(
                25000,
                2000,
                24000
        );

        AffordabilityService service = new AffordabilityService();

        // Act
        AffordabilityResponse response =
                service.calculateAffordability(
                        mortgageResponse,
                        savingsResponse
                );

        // Assert
        assertEquals(50000, mortgageResponse.downPayment());
        assertEquals(25000, savingsResponse.availableSavings());
        assertEquals(2000, savingsResponse.monthlyProjectedSavings());

        assertEquals(1, response.yearsToSavingComplete());
        assertEquals(1, response.monthsToSavingComplete());
    }
}