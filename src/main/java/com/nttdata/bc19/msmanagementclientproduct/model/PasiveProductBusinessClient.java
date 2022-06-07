package com.nttdata.bc19.msmanagementclientproduct.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document
public class PasiveProductBusinessClient extends BaseModel{
    //private String code;
    private BigDecimal amount;
    private String accountNumber;
    private LocalDateTime openingDate;
    private BusinessClient businessClient;
    private PasiveProduct pasiveProduct;
    //private boolean state;
}