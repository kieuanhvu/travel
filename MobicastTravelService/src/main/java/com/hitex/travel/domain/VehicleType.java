package com.hitex.travel.domain;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "vehicle_type", schema ="travel")
public class VehicleType extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "vehicle_type_id")
    private int vehicleTypeId;

    @Column(name = "specifications")
    private String specifications;

    @Column(name = "status")
    private String status;

    @Column(name ="create_date")
    private Date createDate;
}