package com.kafka.practice_driver.config;

import com.kafka.practice_driver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(AppConstant.LOCATION)
                .build();
    }

    @Bean
    public NewTopic message() {
        return TopicBuilder
                .name(AppConstant.MESSAGE)
                .build();
    }

}
