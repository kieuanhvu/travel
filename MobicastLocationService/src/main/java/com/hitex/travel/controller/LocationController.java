package com.hitex.travel.controller;

import com.hitex.mobicastutil.constant.API;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.config.CommonConfig;
import com.hitex.travel.dto.request.BaseRequestData;
import com.hitex.travel.dto.request.GetLocationInfoRequest;
import com.hitex.travel.dto.request.GetUserInfoRequest;
import com.hitex.travel.dto.response.GetLocationInfoResponse;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.LocationServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/travel/v1/api/location/")
@Slf4j
public class LocationController extends BaseController{
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    LocationServices locationServices;

    @PostMapping
    public ResponseEntity<?> getListLocation(@RequestBody(required = false) BaseRequestData<GetLocationInfoRequest> request) throws ApplicationException, SQLException{
        GetLocationInfoRequest requestData = request.getWsRequest();
        IResponseData response = handle(API.GET_LOCATION, requestData);
        return new ResponseEntity<IResponseData>(response,HttpStatus.OK);
    }
}
