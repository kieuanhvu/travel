package com.hitex.travel.controller;

import com.hitex.travel.config.CommonConfig;
import com.hitex.mobicastutil.constant.API;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.dto.request.BaseRequestData;
import com.hitex.travel.dto.request.GetUserInfoRequest;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.BankService;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MaiPH
 */
@Controller
@RequestMapping("/travel/v1/api/")
@Slf4j
public class CustommerController extends BaseController{
    
    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    BankService UserService;
    
    @PostMapping(value = "getUserInfor")
    public ResponseEntity<?> mainEntry(@RequestBody BaseRequestData<GetUserInfoRequest> request) throws ApplicationException, SQLException{
         GetUserInfoRequest requestData = request.getWsRequest();
         IResponseData response = handle(API.GET_USER_INFO, requestData);
         return new ResponseEntity<IResponseData>(response,HttpStatus.OK);
    }
    
}
