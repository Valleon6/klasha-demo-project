package com.valleon.klashademoproject.controllers;

import com.valleon.klashademoproject.services.CurrencyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/currency", produces = MediaType.APPLICATION_JSON_VALUE)
public class CurrencyController {
    private final CurrencyService currencyService;
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/currency-conversion")
    public ResponseEntity<String> convertCurrency(@RequestParam(name = "country") String country,
                                                  @RequestParam(name = "amount") String amount,
                                                  @RequestParam(name = "currency")String currency){
        return new ResponseEntity<>(
                currencyService.convertCurrency(country,amount,currency),
                HttpStatus.OK);
    }

}
