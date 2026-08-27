package com.example.mortgage.savings.model;

public class SavingsRequest {
    private double totalSaved = 0;
    private double emergencyFundAllocation = 0;
    private double monthlyProjectedSavings = 0;

    public double getTotalSaved() { return this.totalSaved; }

    public void setTotalSaved(double totalSaved) { this.totalSaved = totalSaved; }

    public double getEmergencyFundAllocation() { return this.emergencyFundAllocation; };

    public void setEmergencyFundAllocation(double emergencyFundAllocation) {
        this.emergencyFundAllocation = emergencyFundAllocation;
    }

    public double getMonthlyProjectedSavings() { return this.monthlyProjectedSavings; };

    public void setMonthlyProjectedSavings(double monthlyProjectedSavings) {
        this.monthlyProjectedSavings = monthlyProjectedSavings;
    }
}
