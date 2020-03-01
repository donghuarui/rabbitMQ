package com.dhr.controller;

import com.dhr.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        System.err.println("2323");
        User user = new User();
        user.setUsername("donghuarui");
        user.setPassword("123456");
        template.convertAndSend("queue",user);
    }
}
