package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.Matter;
import com.codeclan.certificateassistant.repositories.MatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatterController {
    @Autowired
    MatterRepository matterRepository;

    @GetMapping(value = "/matters")
    public ResponseEntity<List<Matter>> getAllMatters(){
        return new ResponseEntity<>(matterRepository.findAll(), HttpStatus.OK);
    }
}
