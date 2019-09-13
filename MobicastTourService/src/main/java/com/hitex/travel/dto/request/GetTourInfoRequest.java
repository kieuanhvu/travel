package com.hitex.travel.dto.request;

import lombok.Data;

@Data
public class GetTourInfoRequest implements IRequestData{
    private String description;
    private String tourName;
    private String title;
}
