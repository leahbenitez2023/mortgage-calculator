package com.example.mortgage.service;

import com.example.mortgage.model.MortgageRequest;
import com.example.mortgage.model.MortgageResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MortgageCalculatorServiceTest {

    @Test
    @DisplayName("Calculates monthly payment without extra inputs")
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

    @Test
    @DisplayName("Calculates monthly payment with extra inputs")
    void calculatesMonthlyMortgagePaymentWithExtraInputs() {
        // Arrange
        MortgageRequest request = new MortgageRequest();

        request.setHomePrice(500000);
        request.setDownPayment(50000);
        request.setInterestRate(6.5);
        request.setLoanTermYears(30);
        request.setPmiRate(2);
        request.setHomeInsurancePerYear(5000);
        request.setPropertyTaxPerYear(12000);
        request.setHoaPerMonth(400);

        MortgageCalculatorService service = new MortgageCalculatorService();

        // Act
        MortgageResponse response = service.calculateMonthlyPayment(request);

        // Assert
        assertEquals(450000, response.loanAmount());
        assertEquals(2844.31, response.monthlyPrincipalAndInterest(), 0.01);
        assertEquals(750.00, response.monthlyPmi(), 0.01);
        assertEquals(1000.00, response.propertyTaxPerMonth(), 0.01);
        assertEquals(416.67, response.homeInsurancePerMonth(), 0.01);
        assertEquals(400.00, response.hoaPerMonth(), 0.01);
        assertEquals(5410.97, response.totalMonthlyPayment(), 0.01);
    }
}