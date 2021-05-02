package com.mycompany.eligibility;

import java.util.*;

/*

EligibilityServiceMock returns the eligibility status as "true",
On the following conditions,
1.If the "account_id" matches the mocked accounts.
2."Service Level" should be "Platinum".
3."Billing Status" should be "ACTIVE".

If any above condition doesn't match, the eligibility status will be "false" for the user
profile.

 */

public class EligibilityServiceMock implements EligibilityService {
    private final List<UserProfile> userProfiles = setUp();

    private static List<UserProfile> setUp() {

        UserProfile profile1 = new UserProfile();
        profile1.setAccountId("620000000000");
        profile1.setBillingStatus(BillingStatus.ACTIVE.name());
        profile1.setServiceLevel(ServiceLevel.PLATINUM.name());

        UserProfile profile2 = new UserProfile();
        profile2.setAccountId("620000000001");
        profile2.setBillingStatus(BillingStatus.ACTIVE.name());
        profile2.setServiceLevel(ServiceLevel.SILVER.name());

        UserProfile profile3 = new UserProfile();
        profile3.setAccountId("620000000003");
        profile3.setBillingStatus(BillingStatus.ACTIVE.name());
        profile3.setServiceLevel(ServiceLevel.PLATINUM.name());

        UserProfile profile4 = new UserProfile();
        profile4.setAccountId("620000000005");
        profile4.setBillingStatus(BillingStatus.ACTIVE_BLOCKED.name());
        profile4.setServiceLevel(ServiceLevel.GOLD.name());

        return Arrays.asList(profile1, profile2, profile3, profile4);
    }

    public EligibilityServiceEnum checkEligibilityStatus(final String accountId) {
        Optional<UserProfile> accountMatch = userProfiles.stream().filter(userProfile -> userProfile.getAccountId().equals(accountId)).findFirst();
        if (!accountMatch.isPresent()) {
            return EligibilityServiceEnum.INVALID_ACCOUNT_NUMBER;
        }
        return accountMatch.get().getBillingStatus().equals(BillingStatus.ACTIVE.name())
                && accountMatch.get().getServiceLevel().equals(ServiceLevel.PLATINUM.name())
                ? EligibilityServiceEnum.CUSTOMER_ELIGIBLE : EligibilityServiceEnum.CUSTOMER_INELIGIBLE;

    }
/*
Billing status and Service level determines the Rewards eligibility.
I have used enum to set billing status as either ACTIVE or ACTIVE_BLOCKED.Similarly, service level  based on tenure
could be set at SILVER,GOLD, PLATINUM

 */
    private enum BillingStatus {
        ACTIVE, ACTIVE_BLOCKED
    }

    private enum ServiceLevel {
        GOLD, SILVER, PLATINUM
    }
}
