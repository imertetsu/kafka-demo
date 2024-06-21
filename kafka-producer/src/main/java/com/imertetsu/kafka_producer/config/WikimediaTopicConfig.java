package com.imertetsu.kafka_producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {
    @Bean
    public NewTopic wikimediaTopic(){
        return TopicBuilder
                .name("wikimedia-stream")
                .build();
    }

}
