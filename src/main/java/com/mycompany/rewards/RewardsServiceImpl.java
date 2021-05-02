package com.mycompany.rewards;

import com.mycompany.eligibility.EligibilityService;
import com.mycompany.eligibility.EligibilityServiceEnum;
import com.mycompany.factory.EligibleServiceFactory;
import com.mycompany.factory.SkyRewardsService;


public class RewardsServiceImpl implements RewardsService {
    private final EligibleServiceFactory eligibleServiceFactory = (EligibleServiceFactory) SkyRewardsService.getFactory("eligibility_service");
    private final String VALIDATION_ERROR_CODE = "validation_error";
    private final String VALIDATION_ERROR_DESC = "INVALID ACCOUNT FORMAT";
    private final RewardsServiceStatus rewardsService = new RewardsServiceStatus();

    public RewardsServiceStatus rewards(String accounId, String channel) {
        if (isValidAccountLength(accounId) && isChannelExist(channel)) {
            EligibilityService eligibilityService = eligibleServiceFactory.create("eligibility_service_mock");
            EligibilityServiceEnum eligibilityServiceResponse = eligibilityService.checkEligibilityStatus(accounId);
            rewardsService.setStatusCode(eligibilityServiceResponse.name());
            if (eligibilityServiceResponse.name().equals(EligibilityServiceEnum.CUSTOMER_ELIGIBLE.name()))
                rewardsService.setStatusDescription(ChannelRewardEnum.valueOf(channel).getReward());
            else
                rewardsService.setStatusDescription(eligibilityServiceResponse.getDesc());
        } else {
            rewardsService.setStatusCode(VALIDATION_ERROR_CODE);
            rewardsService.setStatusDescription(VALIDATION_ERROR_DESC);
        }
        return rewardsService;
    }

    private boolean isValidAccountLength(String accounId) {
        return accounId.length() == 12;
    }

    private boolean isChannelExist(String channel) {
        for (ChannelRewardEnum c : ChannelRewardEnum.values()) {
            if (c.name().equalsIgnoreCase(channel)) {
                return true;
            }
        }
        return false;
    }
}
