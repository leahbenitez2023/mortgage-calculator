package com.example.mortgage.service;

import com.example.mortgage.savings.model.SavingsRequest;
import com.example.mortgage.savings.model.SavingsResponse;
import com.example.mortgage.savings.service.SavingsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SavingsServiceTest {

    @Test
    void calculateProjectedSavings() {
        // Arrange
        SavingsRequest request = new SavingsRequest();

        request.setTotalSaved(40000);
        request.setEmergencyFundAllocation(15000);
        request.setMonthlyProjectedSavings(2000);

        SavingsService service = new SavingsService();

        // Act
        SavingsResponse response = service.calculateProjectedSavings(request);

        // Assert
        assertEquals(25000, response.availableSavings(), 0.01);
        assertEquals(2000, response.monthlyProjectedSavings(), 0.01);
        assertEquals(24000, response.yearlyProjectedSavings(), 0.01);
    }
}