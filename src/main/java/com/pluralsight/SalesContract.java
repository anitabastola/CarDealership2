package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFees;
    private double processingFees;
    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, double vehicleSold, double salesTaxAmount, double recordingFees, double processingFees, boolean finance) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFees = recordingFees;
        this.processingFees = processingFees;
        this.finance = finance;

    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFees() {
        return recordingFees;
    }

    public void setRecordingFees(double recordingFees) {
        this.recordingFees = recordingFees;
    }

    public double getProcessingFees() {
        return processingFees;
    }

    public void setProcessingFees(double processingFees) {
        this.processingFees = processingFees;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {

        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }


}
