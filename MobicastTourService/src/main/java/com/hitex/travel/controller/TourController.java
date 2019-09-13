package com.hitex.travel.controller;

import com.hitex.mobicastutil.constant.API;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.config.CommonConfig;
import com.hitex.travel.dto.request.BaseRequestData;
import com.hitex.travel.dto.request.GetTourInfoRequest;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.TourServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/travel/v1/api/tour/")
@Slf4j
public class TourController extends BaseController{
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    TourServices tourServices;

    @PostMapping
    public ResponseEntity<?> getListTour(@RequestBody BaseRequestData<GetTourInfoRequest> request) throws ApplicationException, SQLException {
        GetTourInfoRequest requestData = request.getWsRequest();
        IResponseData response = handle(API.GET_TOUR, requestData);
        return new ResponseEntity<IResponseData>(response, HttpStatus.OK);
    }
}
