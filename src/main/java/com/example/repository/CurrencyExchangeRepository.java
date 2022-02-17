package com.example.repository;

import com.example.entity.CurrencyExchange;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CurrencyExchangeRepository extends MongoRepository<CurrencyExchange, String> {

    @Query("Select c from CurrencyExchange c where c.from = :from and c.to = :to")
    public CurrencyExchange findByFromAndTo(String from, String to);
}
