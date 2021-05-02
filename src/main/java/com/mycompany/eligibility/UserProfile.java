package com.mycompany.eligibility;

public class UserProfile {
    private String accountId;
    private String serviceLevel;
    private String billingStatus;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public String getBillingStatus() {
        return billingStatus;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "accountId='" + accountId + '\'' +
                ", serviceLevel='" + serviceLevel + '\'' +
                ", billingStatus='" + billingStatus + '\'' +
                '}';
    }
}
