package com.example.mortgage.model;

public class MortgageRequest {

    private double homePrice;
    private double downPayment;
    private double interestRate;
    private int loanTermYears;

    public double getHomePrice() {
        return homePrice;
    }

    public void setHomePrice(double homePrice) {
        this.homePrice = homePrice;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTermYears() {
        return loanTermYears;
    }

    public void setLoanTermYears(int loanTermYears) {
        this.loanTermYears = loanTermYears;
    }
}
