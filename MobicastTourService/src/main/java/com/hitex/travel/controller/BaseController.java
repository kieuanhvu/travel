package com.hitex.travel.controller;

import com.hitex.mobicastutil.constant.ApplicationCode;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.api.IApi;
import com.hitex.travel.dto.request.IRequestData;
import com.hitex.travel.dto.response.IResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author MaiPH
 */
public class BaseController {
    
    @Autowired
    private ApplicationContext context;
    
    protected IResponseData handle(String apiName,IRequestData request) throws ApplicationException{
        IApi api = context.getBean(apiName, IApi.class);
        if(api == null){
           throw new ApplicationException(ApplicationCode.API_NOT_FOUND);
        }
        return api.execute(request);
    }
}
