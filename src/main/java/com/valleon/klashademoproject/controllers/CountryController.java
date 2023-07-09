package com.valleon.klashademoproject.controllers;

import com.valleon.klashademoproject.Domain.response.CountryDataResponse;
import com.valleon.klashademoproject.Domain.response.CountryStateAndCitiesResponse;
import com.valleon.klashademoproject.services.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
    private final CountryService countryService;
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/details")
    public ResponseEntity<CountryDataResponse> retrieveCountryDetails(@RequestParam("country") String country  ){
        return new ResponseEntity<>(
                countryService.getCountryData(country),
                HttpStatus.OK);
    }


    @GetMapping("/states-cities")
    public ResponseEntity<List<CountryStateAndCitiesResponse>> retrieveCitiesAndStatesInCountry(@RequestParam("country") String country  ){
        return new ResponseEntity<>(
                countryService.getCitiesAndStatesInCountry(country),
                HttpStatus.OK);
    }

}
