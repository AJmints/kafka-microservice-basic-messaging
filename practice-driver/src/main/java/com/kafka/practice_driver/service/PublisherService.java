package com.kafka.practice_driver.service;

import com.kafka.practice_driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.LOCATION, location); // This will send location data to the consumer, Spring will handle it automatically
        return true;
    }

    public boolean updateMessage(String message) {
        kafkaTemplate.send(AppConstant.MESSAGE, message);
        return true;
    }

}
