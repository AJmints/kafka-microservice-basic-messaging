package com.kafka.practice_driver.controller;
import com.kafka.practice_driver.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private PublisherService publisherService;

    // Business Logic


    @PutMapping(value = "location")
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 100;
        while (range > 0) {
            publisherService.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(1000);

            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Update")
                , HttpStatus.OK);
    }

    @PostMapping(value = "message")
    @RequestMapping(value = "/message")
    public ResponseEntity updateMessage(@RequestBody String message) throws InterruptedException {

        publisherService.updateMessage(message);

        return new ResponseEntity<>(Map.of("message", message), HttpStatus.OK);
    }

}
