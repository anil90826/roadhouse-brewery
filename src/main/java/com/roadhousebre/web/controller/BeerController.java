package com.roadhousebre.web.controller;

import com.roadhousebre.services.BeerService;
import com.roadhousebre.web.model.BeerDto;
import com.roadhousebre.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<> (beerService.getBeerbyId(beerId), HttpStatus.OK);
    }

}
