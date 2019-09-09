package com.hitex.travel.dto.request;

import lombok.Data;

/**
 *
 * @author MaiPH
 */
@Data
public class GetUserInfoRequest implements IRequestData{
    private String userName;
}
