package com.valleon.klashademoproject.services.impl;

import com.google.gson.Gson;
import com.valleon.klashademoproject.Domain.response.CityPopulationResponse;
import com.valleon.klashademoproject.Domain.response.CountryCitiesResponse;
import com.valleon.klashademoproject.Domain.response.PopulousCitiesResponse;
import com.valleon.klashademoproject.exceptions.CityPopulationNotFoundException;
import com.valleon.klashademoproject.exceptions.InvalidNumberException;
import com.valleon.klashademoproject.services.CityService;
import com.valleon.klashademoproject.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.valleon.klashademoproject.api.ApiClient.sendOkHttpRequestCity;
import static com.valleon.klashademoproject.constants.UrlConstants.CITY_POPULATION;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

    private final CountryService countryService;

    @Override
    public List<PopulousCitiesResponse> getCitiesOf_IT_NZ_GH_ByDescPopulation(String numberOfCities) {
        long cityNumbers = Long.parseLong(numberOfCities);
        if (cityNumbers < 1) {
            throw new InvalidNumberException(cityNumbers);
        }
        List<String> threeCountriesCitylist = new ArrayList<>();

        CountryCitiesResponse italyCities = countryService.getCitiesInCountry("italy");
        CountryCitiesResponse ghanaCities = countryService.getCitiesInCountry("ghana");
        CountryCitiesResponse newZealandCities = countryService.getCitiesInCountry("new zealand");

        threeCountriesCitylist.addAll(italyCities.getData());
        threeCountriesCitylist.addAll(newZealandCities.getData());
        threeCountriesCitylist.addAll(ghanaCities.getData());

        if (threeCountriesCitylist.isEmpty()) {
            throw new CityPopulationNotFoundException("Italy,New Zealand,Ghana");
        }
        List<PopulousCitiesResponse> unsortedCities = new ArrayList<>();

        for (String city : threeCountriesCitylist) {
            PopulousCitiesResponse populousCity = new PopulousCitiesResponse();
            populousCity.setCityName(city);

            long population = getLatestPopulation(city);
            populousCity.setPopulation(population);
            unsortedCities.add(populousCity);
        }
        unsortedCities.sort(Comparator.comparingLong(PopulousCitiesResponse::getPopulation).reversed());
        List<PopulousCitiesResponse> sortedCities = new ArrayList<>();

        for (int i = 0; i < cityNumbers; i++) {
            sortedCities.add(unsortedCities.get(i));
            if (unsortedCities.get(i + 1) == null) {
                break;
            }
        }
        return sortedCities;
    }

    @Override
    public CityPopulationResponse getCityPopulation(String city) {
        try {
            String jsonResponse = sendOkHttpRequestCity(CITY_POPULATION, city);
            Gson gson = new Gson();
            CityPopulationResponse cityPopulationResponse = gson.fromJson(jsonResponse, CityPopulationResponse.class);
            System.out.println(cityPopulationResponse.toString());

            return cityPopulationResponse;
        } catch (Exception e) {
            throw new CityPopulationNotFoundException(city);
        }
    }

    public Long getLatestPopulation(String city) {
        CityPopulationResponse populationResponse = getCityPopulation(city.toLowerCase());
        if(populationResponse.getData() == null || populationResponse.getData().getPopulationCounts()== null ){
            return 0L;
        }
        String population = populationResponse.
                getData()
                .getPopulationCounts().get(0).getValue();
        System.out.println("population = " + population);

        if(population == null){
          return 0L;
      }
        return Long.valueOf(population);
    }
}
