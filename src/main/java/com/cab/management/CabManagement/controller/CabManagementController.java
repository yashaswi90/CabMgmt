package com.cab.management.CabManagement.controller;

import com.cab.management.CabManagement.entity.Cab;
import com.cab.management.CabManagement.services.CabRegistrationPublisher;
import com.cab.management.CabManagement.services.RegisterCabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(CabRegistrationPublisher.class)
public class CabManagementController {

   @Autowired
    CabRegistrationPublisher cabRegistrationPublisher;

    @Autowired
    RegisterCabService registerCabService;

    @PostMapping("/onboardCab")
    public String registerCab(@RequestBody Cab cab) {
        registerCabService.onboardCab(cab);
        cabRegistrationPublisher.cabRegistration().send(MessageBuilder.withPayload(cab).build());
        return "Onboarding Cab registered successfully";

    }

}
