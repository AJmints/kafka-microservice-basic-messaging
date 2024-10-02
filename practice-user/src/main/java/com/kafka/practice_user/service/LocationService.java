package com.kafka.practice_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "location", groupId = "user-group")
    public void locationLister(String location) {

        System.out.println(location);

    }

    @KafkaListener(topics = "user-message", groupId = "user-group")
    public void messageListener(String message) {

        System.out.println(message);

    }

}
