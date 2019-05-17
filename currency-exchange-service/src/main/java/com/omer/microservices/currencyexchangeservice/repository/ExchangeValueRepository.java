package com.omer.microservices.currencyexchangeservice.repository;

import com.omer.microservices.currencyexchangeservice.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from,String to);
}
