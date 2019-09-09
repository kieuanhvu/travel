package com.hitex.travel.domain;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "tour", schema ="travel")
public class Tour extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "tour_id")
    private int tourId;

    @ManyToOne
    @JoinColumn(name ="management_id")
    private ManagementUnit managementId;

    @Column(name = "tour_name")
    private String tourName;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "slug")
    private String slug;

    @Column(name = "status")
    private String status;

    @Column(name ="create_date")
    private Date createDate;
}
