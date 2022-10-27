package com.vickysingh.dashboard.controller;

import org.springframework.web.bind.annotation.RestController;

import com.vickysingh.dashboard.entity.Form;
import com.vickysingh.dashboard.entity.Visitor;
import com.vickysingh.dashboard.service.DashboardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class Controller {

    @Autowired
    DashboardService service;

    @RequestMapping("/")
    public String index() {
        return "Vicky Kumar Singh | Dashboard";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public ResponseEntity<Void> saveForm(@RequestBody Form formDetail) {
        return service.saveForm(formDetail);
    }
    
    @RequestMapping(value = "/get-visitor", method = RequestMethod.GET)
    public ResponseEntity<Visitor> getVisitor() {
        return service.getVisitor();
    }

}