package com.example.mortgage.affordability.controller;

import com.example.mortgage.affordability.model.AffordabilityRequest;
import com.example.mortgage.affordability.model.AffordabilityResponse;
import com.example.mortgage.affordability.service.AffordabilityService;
import com.example.mortgage.mortgage.model.MortgageResponse;
import com.example.mortgage.mortgage.service.MortgageCalculatorService;
import com.example.mortgage.savings.model.SavingsResponse;
import com.example.mortgage.savings.service.SavingsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/affordability")
public class AffordabilityController {

    private final MortgageCalculatorService mortgageCalculatorService;
    private final SavingsService savingsService;
    private final AffordabilityService affordabilityService;

    public AffordabilityController(
            MortgageCalculatorService mortgageCalculatorService,
            SavingsService savingsService,
            AffordabilityService affordabilityService
    ) {
        this.mortgageCalculatorService = mortgageCalculatorService;
        this.savingsService = savingsService;
        this.affordabilityService = affordabilityService;
    }

    @PostMapping("/calculate")
    public AffordabilityResponse calculateAffordability(
            @RequestBody AffordabilityRequest request
    ) {
        MortgageResponse mortgageResponse =
                mortgageCalculatorService.calculateMonthlyPayment(
                        request.getMortgageRequest()
                );

        SavingsResponse savingsResponse =
                savingsService.calculateProjectedSavings(
                        request.getSavingsRequest()
                );

        return affordabilityService.calculateAffordability(
                mortgageResponse,
                savingsResponse
        );
    }
}