package com.example.mortgage.controller;

import com.example.mortgage.model.MortgageRequest;
import com.example.mortgage.model.MortgageResponse;
import com.example.mortgage.service.MortgageCalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mortgage")

public class MortgageController {
    private final MortgageCalculatorService mortgageCalculatorService;

    public MortgageController(MortgageCalculatorService mortgageCalculatorService) {
        this.mortgageCalculatorService = mortgageCalculatorService;
    }

    @PostMapping("/calculate")
    public MortgageResponse calculateMortgage(@RequestBody MortgageRequest request) {
        return mortgageCalculatorService.calculateMonthlyPayment((request));
    }
}
