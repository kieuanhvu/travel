package com.hitex.travel.dto.response;

import lombok.Data;

@Data
public class GetTourInfoResponse implements IResponseData{
    private Object data;
    private int errorCode;
    private String message;
}
