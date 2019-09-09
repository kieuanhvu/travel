package com.hitex.travel.domain;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "vehicle", schema ="travel")
public class Vehicle extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "vehicle_id")
    private int vehicleId;

    @ManyToOne
    @JoinColumn(name ="management_id")
    private ManagementUnit managementId;

    @ManyToOne
    @JoinColumn(name ="vehicle_type_id")
    private VehicleType vehicleTypeId;

    @Column(name = "vehicle_name")
    private String vehicleName;

    @Column(name = "status")
    private String status;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name ="quantity")
    private int quantity;

    @Column(name ="price")
    private double price;
}