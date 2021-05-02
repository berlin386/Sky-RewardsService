package com.mycompany.factory;

public class SkyRewardsService {
    public static AbstractFactory getFactory(String service) {
        if ("rewards_service".equals(service)) {
            return new RewardsServiceFactory();
        } else if ("eligibility_service".equals(service)) {
            return new EligibleServiceFactory();
        }
        return null;
    }
}
