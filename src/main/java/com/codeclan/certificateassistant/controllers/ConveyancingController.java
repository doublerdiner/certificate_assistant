package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.Conveyancing;
import com.codeclan.certificateassistant.repositories.ConveyancingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConveyancingController {
    @Autowired
    ConveyancingRepository conveyancingRepository;

    @GetMapping(value = "/conveyances")
    public ResponseEntity<List<Conveyancing>> getAllConveyances(){
        return new ResponseEntity<>(conveyancingRepository.findAll(), HttpStatus.OK);
    }
}
