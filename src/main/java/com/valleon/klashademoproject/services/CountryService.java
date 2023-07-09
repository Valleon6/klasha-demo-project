package com.valleon.klashademoproject.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.valleon.klashademoproject.Domain.response.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

public interface CountryService {


    String getCapitalCity(String countryIso2) throws IOException;
    CountryPopulationResponse getCountryPopulation(String country);

    Iso2And3Response getIso2AndIso3(String country);

    LocationResponse getLocation(String country);

    StateCitiesResponse getCitiesInState(String country, String state);

    CountryStatesResponse getStates(String country);

    CountryCitiesResponse getCitiesInCountry(String country);

    CountryDataResponse getCountryData(String country);

    List<CountryStateAndCitiesResponse> getCitiesAndStatesInCountry(String country);

    String getCurrency(String country);

}
