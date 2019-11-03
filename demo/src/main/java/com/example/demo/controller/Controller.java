package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
public class Controller {

    @GetMapping(path = "/option-test")
    public String test(@RequestHeader("merchantId") String merchantId) {
        return merchantId;
    }
}

