package com.vickysingh.dashboard.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Azure Spring Apps! Yahoo v good to go";
    }

}