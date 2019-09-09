package com.hitex.travel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author MaiPH
 */
@Data
@Entity

@Table(name = "bank",schema ="travel")
public class Bank extends Domain {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name ="bank_id")
    private int bankId;

    @Column(name ="bank_name")
    private String bankName;

    @Column(name ="description")
    private String description;

    @Column(name ="create_date")
    private Date createDate;
}
