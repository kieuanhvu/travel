package com.hitex.travel.dto.response;

import lombok.Data;

/**
 *
 * @author MaiPH
 */
@Data
public class GetBankInfoResponse implements IResponseData{
    private Object data;
    private int errorCode;
    private String message;
}
