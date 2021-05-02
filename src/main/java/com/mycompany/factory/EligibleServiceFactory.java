package com.mycompany.factory;

import com.mycompany.eligibility.EligibilityService;
import com.mycompany.eligibility.EligibilityServiceMock;

public class EligibleServiceFactory implements AbstractFactory<EligibilityService> {

    @Override
    public EligibilityService create(String serviceType) {
        if ("eligibility_service_mock".equalsIgnoreCase(serviceType)) {
            return new EligibilityServiceMock();
        }
        return null;
    }

}