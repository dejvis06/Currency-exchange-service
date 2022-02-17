package com.example.service;

import com.example.entity.CurrencyExchange;
import com.example.repository.CurrencyExchangeRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    private CurrencyExchangeRepository currencyExchangeRepository;

    public CurrencyExchange retrieveExchangeValue(String from, String to) {
        return currencyExchangeRepository.findByFromAndTo(from, to);
    }
}
