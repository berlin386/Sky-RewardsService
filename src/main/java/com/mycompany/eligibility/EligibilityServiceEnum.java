package com.mycompany.eligibility;

/*
Used Java enum to define the possible eligibility scenario's: CUSTOMER_ELIGIBLE, CUSTOMER_INELIGIBLE, INVALID_ACCOUNT_NUMBER.
*/
public enum EligibilityServiceEnum {

    CUSTOMER_ELIGIBLE("Customer is eligible"),
    CUSTOMER_INELIGIBLE("Customer is not eligible"),
    INVALID_ACCOUNT_NUMBER("The supplied account\n" +
            "number is invalid");

    private final String desc;

    EligibilityServiceEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
