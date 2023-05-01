package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.TCSP;
import com.codeclan.certificateassistant.repositories.TCSPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TCSPController {
    @Autowired
    TCSPRepository tcspRepository;

    @GetMapping(value = "/tcsps")
    public ResponseEntity<List<TCSP>> getAllTcsps(){
        return new ResponseEntity<>(tcspRepository.findAll(), HttpStatus.OK);
    }
}
