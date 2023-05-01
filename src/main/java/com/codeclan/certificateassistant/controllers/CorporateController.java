package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.Corporate;
import com.codeclan.certificateassistant.repositories.CorporateRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CorporateController {
    @Autowired
    CorporateRepository corporateRepository;

    @GetMapping(value = "/corporates")
    public ResponseEntity<List<Corporate>> getAllCorporates(){
        return new ResponseEntity<>(corporateRepository.findAll(), HttpStatus.OK);
    }
}
