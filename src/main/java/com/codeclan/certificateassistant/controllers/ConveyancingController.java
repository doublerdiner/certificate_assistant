package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.Conveyancing;
import com.codeclan.certificateassistant.repositories.ConveyancingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ConveyancingController {
    @Autowired
    ConveyancingRepository conveyancingRepository;

    @GetMapping(value = "/conveyances")
    public ResponseEntity<List<Conveyancing>> getAllConveyances(
            @RequestParam(name = "clienttype", required = false) String clientType,
            @RequestParam(name = "jurisdiction", required = false)String jurisdiction,
            @RequestParam(name = "notjurisdiction", required = false)String notJurisdiction,
            @RequestParam(name = "min", required = false)Integer min,
            @RequestParam(name = "max", required = false)Integer max,
            @RequestParam(name = "residential", required = false)Boolean residential
    ){
//        if(clientType == "Individual" && jurisdiction == "United Kingdom" && min == 100000 && max == 1000000 && residential == true) {
        if(clientType!=null && jurisdiction != null && min == 100000 && max == 1000000 && residential ) {
//          QUESTION 1 - UK Client
//          QUESTION 3 - UK Body Corporate
            return new ResponseEntity<>(conveyancingRepository.findConveyancesByClientJurisdictionAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(jurisdiction, clientType, min, max, residential), HttpStatus.OK);
        }
        else if(clientType != null && notJurisdiction != null && min == 100000 && max == 1000000 && residential) {
//          QUESTION 2 - NON UK Client
//          QUESTION 4 - NON UK Body Corporate
            return new ResponseEntity<>(conveyancingRepository.findConveyancesByClientJurisdictionNotInAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(Arrays.asList(notJurisdiction), clientType, min, max, residential), HttpStatus.OK);
        }
//
        return new ResponseEntity<>(conveyancingRepository.findAll(), HttpStatus.OK);
    }
}
