package com.hitex.travel.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity

@Table(name = "exchange_rate", schema = "travel")
public class ExchangeRate extends Domain {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "exchange_rate_id")
    private int exchangeRateId;

    @ManyToOne
    @JoinColumn(name ="bank_id")
    private Bank bankId;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "Sell")
    private double Sell;

    @Column(name = "buy")
    private double buy;

    @Column(name ="create_date")
    private Date createDate;

}