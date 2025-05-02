package com.test.springbootrabbitmq.controller;

import com.test.springbootrabbitmq.service.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luthfi aryarizki
 * @description Test RabbitMQ
 * @date 2025/05/02 13:00
 */
@RestController
public class RabbitMQController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @GetMapping("/send")
    public String send(@RequestParam String message) {
        rabbitMQProducer.sendMessage(message);
        return "Message sent successfully, message=" + message;
    }

}
