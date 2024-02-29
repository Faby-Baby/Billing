package com.softwarequality;
import java.util.Date;

public class Bill {
    private int ID;
    private String UtilityType;
    private Date PayBy;
    private Date BillingDate;
    private Date BillingStart;
    private Date BillingEnd;
    private double paymentTotal;
    private double usuageAmt;
    private String usuageMeasurement;
    private boolean paid;
    private double amountPaid;

    // Getters
    public int getID() {
        return ID;
    }

    public String getUtilityType() {
        return UtilityType;
    }

    public Date getPayBy() {
        return PayBy;
    }

    public Date getBillingDate() {
        return BillingDate;
    }

    public Date getBillingStart() {
        return BillingStart;
    }

    public Date getBillingEnd() {
        return BillingEnd;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public double getUsuageAmt() {
        return usuageAmt;
    }

    public String getUsuageMeasurement() {
        return usuageMeasurement;
    }

    public boolean isPaid() {
        return paid;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    // Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUtilityType(String UtilityType) {
        this.UtilityType = UtilityType;
    }

    public void setPayBy(Date PayBy) {
        this.PayBy = PayBy;
    }

    public void setBillingDate(Date BillingDate) {
        this.BillingDate = BillingDate;
    }

    public void setBillingStart(Date BillingStart) {
        this.BillingStart = BillingStart;
    }

    public void setBillingEnd(Date BillingEnd) {
        this.BillingEnd = BillingEnd;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public void setUsuageAmt(double usuageAmt) {
        this.usuageAmt = usuageAmt;
    }

    public void setUsuageMeasurement(String usuageMeasurement) {
        this.usuageMeasurement = usuageMeasurement;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

}



