package com.example.mortgage.service;

import com.example.mortgage.model.MortgageRequest;
import com.example.mortgage.model.MortgageResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MortgageCalculatorServiceTest {

    @Test
    void calculatesMonthlyMortgagePayment() {
        // Arrange
        MortgageRequest request = new MortgageRequest();

        request.setHomePrice(500000);
        request.setDownPayment(50000);
        request.setInterestRate(6.5);
        request.setLoanTermYears(30);

        MortgageCalculatorService service = new MortgageCalculatorService();

        // Act
        MortgageResponse response = service.calculateMonthlyPayment(request);

        // Assert
        assertEquals(450000, response.loanAmount());
        assertEquals(2843.31, response.monthlyPrincipalAndInterest(), 1);
    }
}