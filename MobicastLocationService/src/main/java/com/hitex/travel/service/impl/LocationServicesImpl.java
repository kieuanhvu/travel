package com.hitex.travel.service.impl;

import com.hitex.travel.domain.Location;
import com.hitex.travel.repository.readonly.RLocationRepository;
import com.hitex.travel.service.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServicesImpl implements LocationServices {
    @Autowired
    RLocationRepository rLocationRepository;

    @Override
    public List<Location> getListLocation() {
        return rLocationRepository.getListLocation();
    }
}
