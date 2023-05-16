package io.m4nko.github.RabbitMQ.service;

import io.m4nko.github.RabbitMQ.model.Person;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumer {

    @RabbitListener(queues = "Mobile")
    public void getMessage(Person p){
        System.out.println("Person name on mobile queue: " + p.getName());
    }
}
