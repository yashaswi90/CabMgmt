package com.cab.management.CabManagement.services;

import com.cab.management.CabManagement.entity.Cab;
import com.cab.management.CabManagement.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterCabService {

    @Autowired
    private CabRepository cabRepository;

    public void onboardCab(Cab cab) {
        cabRepository.save(cab);
    }
}
