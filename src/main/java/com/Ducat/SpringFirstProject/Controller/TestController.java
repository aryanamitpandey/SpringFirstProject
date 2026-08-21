package com.Ducat.SpringFirstProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class TestController {
    @GetMapping("/get")
    public String getEndpoint(){
        return "spring boot project working";
    }

    @GetMapping("/get/map")
    public Map<String, String> getEndpoint2(){
        return Map.of("data","demo-data");
    }
}
    
    

