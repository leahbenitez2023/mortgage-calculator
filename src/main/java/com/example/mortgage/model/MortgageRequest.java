package com.example.mortgage.model;

public class MortgageRequest {

    private double homePrice;
    private double downPayment;
    private double interestRate;
    private int loanTermYears;

    private double pmiRate = 0;
    private double propertyTaxPerYear = 0;
    private double homeInsurancePerYear = 0;
    private double hoaPerMonth = 0;


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

    public double getPmiRate() {
        return pmiRate;
    }

    public void setPmiRate(double pmiRate) {
        this.pmiRate = pmiRate;
    }

    public double getPropertyTaxPerYear() {
        return propertyTaxPerYear;
    }

    public void setPropertyTaxPerYear(double propertyTaxPerYear) {
        this.propertyTaxPerYear = propertyTaxPerYear;
    }

    public double getHomeInsurancePerYear() {
        return homeInsurancePerYear;
    }

    public void setHomeInsurancePerYear(double homeInsurancePerYear) {
        this.homeInsurancePerYear = homeInsurancePerYear;
    }

    public double getHoaPerMonth() {
        return hoaPerMonth;
    }

    public void setHoaPerMonth(double hoaPerMonth) {
        this.hoaPerMonth = hoaPerMonth;
    }
}
