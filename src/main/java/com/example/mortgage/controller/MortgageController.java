package com.example.mortgage.controller;

import com.example.mortgage.model.MortgageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mortgage")

public class MortgageController {

    @PostMapping("/calculate")
    public MortgageRequest calculateMortgage(@RequestBody MortgageRequest request) {
        return request;
    }
}
