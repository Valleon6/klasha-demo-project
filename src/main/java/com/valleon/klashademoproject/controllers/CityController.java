package com.valleon.klashademoproject.controllers;

import com.valleon.klashademoproject.Domain.response.PopulousCitiesResponse;
import com.valleon.klashademoproject.services.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/city", produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping ("/populous-cities/{numberOfCities}")
    public ResponseEntity<List<PopulousCitiesResponse>> retrievePopulousCitiesOf_IT_NZ_GH (@PathVariable("numberOfCities") String numberOfCities) {

    List<PopulousCitiesResponse> response = cityService.getCitiesOf_IT_NZ_GH_ByDescPopulation(numberOfCities);
    return new ResponseEntity<>(response,HttpStatus.OK);

    }

}
