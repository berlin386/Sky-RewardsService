package com.mycompany.rewards;

public class RewardsServiceStatus {
    private String statusCode;
    private String statusDescription;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Override
    public String toString() {
        return "RewardsServiceStatus{" +
                "statusCode='" + statusCode + '\'' +
                ", statusDescription='" + statusDescription + '\'' +
                '}';
    }
}
