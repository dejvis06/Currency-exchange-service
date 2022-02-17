package com.example.service;

import com.example.entity.CurrencyExchange;
import com.example.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    public CurrencyExchange retrieveExchangeValue(String from, String to) {
        return currencyExchangeRepository.findByFromAndTo(from, to);
    }
}
