package com.hitex.travel.service.impl;

import com.hitex.travel.domain.Tour;
import com.hitex.travel.repository.readonly.RTourRepository;
import com.hitex.travel.service.TourServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServicesImpl implements TourServices {
    @Autowired
    RTourRepository rTourRepository;

    @Override
    public List<Tour> getListTour() {
        return rTourRepository.getListTour();
    }
}
