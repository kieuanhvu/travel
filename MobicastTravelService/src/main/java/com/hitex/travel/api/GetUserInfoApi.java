package com.hitex.travel.api;

import com.hitex.mobicastutil.constant.API;
import com.hitex.travel.dto.request.IRequestData;
import com.hitex.travel.dto.response.GetBankInfoResponse;
import com.hitex.travel.dto.response.IResponseData;
import com.hitex.travel.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author MaiPH
 */
@Component(value = API.GET_USER_INFO)
@Scope("prototype")
public class GetUserInfoApi implements IApi{

    @Autowired
    BankService bankService;
    
    @Override
    public IResponseData excute(IRequestData request) {

        GetBankInfoResponse response = new GetBankInfoResponse();
        response.setData(bankService.getListBank());
        return response;
    }
    
}
