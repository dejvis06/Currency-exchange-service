package com.example.service;

import com.example.entity.CurrencyExchange;
import com.example.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @Value("${server.port}")
    private int serverPort;

    public CurrencyExchange retrieveExchangeValue(String from, String to) {
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
        currencyExchange.setEnvironment(String.valueOf(serverPort));
        return currencyExchange;
    }
}
