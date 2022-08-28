package com.example;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyConsumer {

    @Incoming("my-topic")
    public void consume(Order message) {
        // process your price.

       // System.out.println("Got a message from kafka ::" + order.getId() + " -- " + order.getItem());

        System.out.println("Got a message from kafka ::" +message);
    }
}