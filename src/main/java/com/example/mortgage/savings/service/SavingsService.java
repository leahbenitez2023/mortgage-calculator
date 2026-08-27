package com.example.mortgage.savings.service;

import com.example.mortgage.savings.model.SavingsRequest;
import com.example.mortgage.savings.model.SavingsResponse;

public class SavingsService {
    public SavingsResponse calculateProjectedSavings(SavingsRequest request) {
        double totalSaved = request.getTotalSaved();
        double emergencyFundAllocation = request.getEmergencyFundAllocation();
        double monthlyProjectedSavings = request.getMonthlyProjectedSavings();

        double availableSavings = totalSaved - emergencyFundAllocation;
        double yearlyProjectedSavings = monthlyProjectedSavings * 12;

        return new SavingsResponse(availableSavings, monthlyProjectedSavings, yearlyProjectedSavings);
    }
}
