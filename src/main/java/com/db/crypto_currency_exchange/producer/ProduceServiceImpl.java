package com.db.crypto_currency_exchange.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProduceServiceImpl implements ProduceService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private String topicName = "topic1";

    @Scheduled(fixedDelay = 1000)
    @Override
    public void sendMessage() {
        kafkaTemplate.send(topicName, "message");
    }
}
