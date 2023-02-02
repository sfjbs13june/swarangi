package com.swarangi.app.controller;

import com.swarangi.app.producer.ArtemisProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerController.class);
    private final ArtemisProducer producer;

    public ProducerController(ArtemisProducer producer) {
        this.producer = producer;
    }

    @RequestMapping(value = "/send/message", method = RequestMethod.GET)
    public ResponseEntity<String> Produce(@RequestParam("name") String name,@RequestParam("age") String age)
    {
        try {
            String msg = name+":"+age;
            producer.send(msg);
            return ResponseEntity.ok()

                                 .body("message sent:"+msg);
        } catch (Exception e) {
            LOGGER.error("Exception while handling uplink message: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
