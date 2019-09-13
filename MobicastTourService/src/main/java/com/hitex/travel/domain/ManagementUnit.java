package com.hitex.travel.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "management_unit", schema = "travel")
public class ManagementUnit extends Domain{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name ="management_id")
    private int managementId;

    @Column(name ="name")
    private String name;

    @Column(name ="type")
    private String type;

    @Column(name ="description")
    private String description;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name ="status")
    private int status;
}
