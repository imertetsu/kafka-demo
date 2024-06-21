package com.imertetsu.kafka_producer.controllers;

import com.imertetsu.kafka_producer.services.WikimediaStreamConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wikimedia")
public class WikimediaController {

    private final WikimediaStreamConsumer streamConsumer;

    @Autowired
    public WikimediaController(WikimediaStreamConsumer streamConsumer){
        this.streamConsumer = streamConsumer;
    }

    @GetMapping("/stream")
    public void startPublish(){
        streamConsumer.consumeStreamAndPublish();
    }
}
