package com.example.customerservicebp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerConfigTestController {

    @Value("${test}")
    private String val;

    @GetMapping("/params")
    public Map<String,String> params(){
        return Map.of("value",val);
    }

}
