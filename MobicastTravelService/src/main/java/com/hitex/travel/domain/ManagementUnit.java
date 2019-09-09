package com.hitex.travel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.util.Date;


@Data
@Entity

@Table(name = "management_unit", schema ="travel")
public class ManagementUnit extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name ="management_id")
    private int managementId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name ="create_date")
    private Date createDate;

}
