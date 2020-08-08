package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "hello")
public class CustomEndpoint {

    @ReadOperation
    public String hello(){
        return "Hello, world";
    }
}
