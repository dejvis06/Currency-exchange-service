package com.example;

import com.example.entity.CurrencyExchange;
import com.example.repository.CurrencyExchangeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class CurrencyExchangeServiceApplicationTests {

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @Test
    void contextLoads() {

        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.setFrom("USD");
        currencyExchange.setTo("INR");
        currencyExchange.setConversionMultiple(new BigDecimal(65));
        currencyExchange.setEnvironment("8000");

        currencyExchangeRepository.save(currencyExchange);
    }

}
