package com.mycompany.factory;

import com.mycompany.rewards.RewardsService;
import com.mycompany.rewards.RewardsServiceImpl;

public class RewardsServiceFactory implements AbstractFactory<RewardsService> {

    @Override
    public RewardsService create(String serviceType) {
        if ("rewards_service".equalsIgnoreCase(serviceType)) {
            return new RewardsServiceImpl();
        }
        return null;
    }

}