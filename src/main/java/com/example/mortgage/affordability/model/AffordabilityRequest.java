package com.example.mortgage.affordability.model;

import com.example.mortgage.mortgage.model.MortgageRequest;
import com.example.mortgage.savings.model.SavingsRequest;

public class AffordabilityRequest {
    private MortgageRequest mortgageRequest;
    private SavingsRequest savingsRequest;

    public MortgageRequest getMortgageRequest() {
        return this.mortgageRequest;
    }

    public void setMortgageRequest(MortgageRequest mortgageRequest) {
        this.mortgageRequest = mortgageRequest;
    }

    public SavingsRequest getSavingsRequest() {
        return this.savingsRequest;
    }

    public void setSavingsRequest(SavingsRequest savingsRequest) {
        this.savingsRequest = savingsRequest;
    }
}
