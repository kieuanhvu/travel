package com.hitex.travel.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity

@Table(name = "location", schema = "travel")
public class Location extends Domain{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name ="location_id")
    private int locationId;

    @Column(name ="location_name")
    private String locationName;

    @Column(name ="sort_description")
    private String sortDescription;

    @Column(name ="description", length = 512)
    private String description;

    @Column(name ="latitude")
    private long latitude;

    @Column(name ="longitude")
    private long longitude;

    @Column(name ="link_vr")
    private String linkVr;

    @Column(name ="status")
    private String status;

    @Column(name ="create_date")
    private Date createDate;
}
