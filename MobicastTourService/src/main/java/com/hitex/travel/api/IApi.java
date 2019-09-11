package com.hitex.travel.api;

import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.dto.request.IRequestData;
import com.hitex.travel.dto.response.IResponseData;

/**
 *
 * @author MaiPH
 */
public interface IApi {
    IResponseData execute(IRequestData request) throws ApplicationException;
}
