package com.imertetsu.kafka_consumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {
    @KafkaListener(topics = "quickstart-events", groupId = "myGroup")
    public void receiveMessage(String message){
        log.info("Consuming the Message: "+ message);
    }
}
