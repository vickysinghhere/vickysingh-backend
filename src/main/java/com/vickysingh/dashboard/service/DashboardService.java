package com.vickysingh.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vickysingh.dashboard.entity.Form;
import com.vickysingh.dashboard.entity.Visitor;
import com.vickysingh.dashboard.repository.FormRepository;
import com.vickysingh.dashboard.repository.VisitorRepository;

@Service
public class DashboardService {

    @Autowired
    private FormRepository repository;
    
    @Autowired
    private VisitorRepository visitorRepository;
    

    public ResponseEntity<Void> saveForm(Form formDetail) {
        ResponseEntity<Void> res;
        try {
            repository.save(formDetail);
            res = new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception ex) {
            res = new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return res;
    }
    
    public ResponseEntity<Void> saveVisitor(Visitor visitor) {
        ResponseEntity<Void> res;
        try {
            visitorRepository.save(visitor);
            res = new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception ex) {
            res = new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return res;
    }
    
    public ResponseEntity<Visitor> getVisitor() {
        ResponseEntity<Visitor> res;
        try {
            Visitor vis = visitorRepository.findById(1L).orElse(null);
            vis.setCount(vis.getCount()+1);
            saveVisitor(vis);
            res = new ResponseEntity<Visitor>(vis, HttpStatus.OK);
        } catch (Exception ex) {
            res = new ResponseEntity<Visitor>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return res;
    }
}
