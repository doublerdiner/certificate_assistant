package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.Individual;
import com.codeclan.certificateassistant.repositories.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndividualController {
    @Autowired
    IndividualRepository individualRepository;

    @GetMapping(value = "/individuals")
    public ResponseEntity<List<Individual>> getAllIndividuals(){
        return new ResponseEntity<>(individualRepository.findAll(), HttpStatus.OK);
    }
}
