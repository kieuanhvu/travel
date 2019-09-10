package com.hitex.travel.api;

import com.hitex.mobicastutil.constant.API;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.dto.request.IRequestData;
import com.hitex.travel.dto.response.GetLocationInfoResponse;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = API.GET_LOCATION)
@Scope("prototype")
public class GetLocationApi implements IApi{
    @Autowired
    LocationServices locationServices;

    @Override
    public IResponseData execute(IRequestData request) throws ApplicationException {
        GetLocationInfoResponse response = new GetLocationInfoResponse();
        response.setData(locationServices.getListLocation());
        return response;
    }
}
