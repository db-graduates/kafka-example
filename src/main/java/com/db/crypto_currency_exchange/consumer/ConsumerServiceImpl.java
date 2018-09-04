package com.db.crypto_currency_exchange.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @KafkaListener(topics = "topic1", groupId = "group1")
    @Override
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
