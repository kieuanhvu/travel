package com.hitex.travel.api;

import com.hitex.mobicastutil.constant.API;
import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.dto.request.IRequestData;
import com.hitex.travel.dto.response.GetTourInfoResponse;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.TourServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = API.GET_TOUR)
@Scope("prototype")
public class GetTourApi implements IApi{
    @Autowired
    TourServices tourServices;

    @Override
    public IResponseData execute(IRequestData request) throws ApplicationException {
        GetTourInfoResponse response = new GetTourInfoResponse();
        response.setData(tourServices.getListTour());
        return response;
    }
}
