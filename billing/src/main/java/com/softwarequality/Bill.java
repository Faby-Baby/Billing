public class Bill {
    private int ID;
    private String UtilityType;
    private date BillingDate;
    private date BillingStart;
    private date BillingEnd;
    private double paymentTotal;
    private double usuageAmt;
    private String usuageMeasurement;
    private boolean paid;
    private int amountPaid;

    // Getters
    public int getID() {
        return ID;
    }

    public String getUtilityType() {
        return utilityType;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public Date getBillingStart() {
        return billingStart;
    }

    public Date getBillingEnd() {
        return billingEnd;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public double getUsageAmt() {
        return usageAmt;
    }

    public String getUsageMeasurement() {
        return usageMeasurement;
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

    public void setUtilityType(String utilityType) {
        this.utilityType = utilityType;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public void setBillingStart(Date billingStart) {
        this.billingStart = billingStart;
    }

    public void setBillingEnd(Date billingEnd) {
        this.billingEnd = billingEnd;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public void setUsageAmt(double usageAmt) {
        this.usageAmt = usageAmt;
    }

    public void setUsageMeasurement(String usageMeasurement) {
        this.usageMeasurement = usageMeasurement;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }
}



