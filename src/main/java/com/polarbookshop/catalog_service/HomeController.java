package com.polarbookshop.catalog_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {
    @Value("${polar.greeting}")
    private String greeting;
    @GetMapping("/")
    public String Greeting(){
        return greeting;

    }
}
