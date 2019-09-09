package com.hitex.travel.domain;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "transaction_location", schema ="travel")
public class TransactionLocation extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "transction_location_id")
    private int tourId;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bankId;

    @Column(name ="name")
    private String name;

    @Column(name ="sort_description")
    private String sortDescription;

    @Column(name ="status")
    private String status;

    @Column(name ="longitude")
    private long longitude;

    @Column(name ="latitude")
    private long latitude;

    @Column(name ="time_open")
    private String timeOpen;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name ="update_date")
    private Date updateDate;

    @Column(name ="update_by")
    private String updateBy;
}
