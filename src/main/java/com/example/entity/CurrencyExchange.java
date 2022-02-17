package com.example.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("currency_exchange")
@Data
public class CurrencyExchange {

    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
