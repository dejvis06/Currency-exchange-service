package com.example.repository;

import com.example.entity.CurrencyExchange;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CurrencyExchangeRepository extends MongoRepository<CurrencyExchange, String> {

    @Query("{$and:[{from:?0},{to:?1}]}")
    public CurrencyExchange findByFromAndTo(String from, String to);
}
