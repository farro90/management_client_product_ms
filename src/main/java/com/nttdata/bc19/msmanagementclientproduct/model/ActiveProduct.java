package com.nttdata.bc19.msmanagementclientproduct.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActiveProduct {
    private String id;
    private String name;
    private BigDecimal interestRateMonth;
    private Boolean allowBusinessClient;
    private Boolean allowPersonClient;
}