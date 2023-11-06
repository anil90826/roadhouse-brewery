package com.roadhousebre.services;

import com.roadhousebre.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerbyId(UUID beerId);
}
