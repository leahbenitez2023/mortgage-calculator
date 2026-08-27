package com.example.mortgage.model;

public class MortgageRequest {

    private double homePrice;
    private double downPayment;
    private double interestRate;
    private int loanTermYears;

    private double pmiRate = 0;
    private double propertyTaxPerYear = 0;
    private double yearlyHomeInsurance = 0;
    private double monthlyHoa = 0;


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

    public double getYearlyPropertyTax() {
        return propertyTaxPerYear;
    }

    public void setYearlyPropertyTax(double yearlyPropertyTax) {
        this.propertyTaxPerYear = yearlyPropertyTax;
    }

    public double yearlyHomeInsurance() {
        return yearlyHomeInsurance;
    }

    public void setYearlyHomeInsurance(double yearlyHomeInsurance) {
        this.yearlyHomeInsurance = yearlyHomeInsurance;
    }

    public double monthlyHoa() {
        return monthlyHoa;
    }

    public void setMonthlyHoa(double monthlyHoa) {
        this.monthlyHoa = monthlyHoa;
    }
}
