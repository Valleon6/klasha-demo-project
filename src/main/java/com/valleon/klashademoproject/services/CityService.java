package com.valleon.klashademoproject.services;

import com.valleon.klashademoproject.Domain.response.CityPopulationResponse;
import com.valleon.klashademoproject.Domain.response.PopulousCitiesResponse;

import java.util.List;

public interface CityService {
    /**
     * @return the top <numberOfCities> cities in order of cityPopulation.
     * If there are not enough cities, return the available ones;
     */
    List<PopulousCitiesResponse> getCitiesOf_IT_NZ_GH_ByDescPopulation(String numberOfCities);

    CityPopulationResponse getCityPopulation(String cityName);


}
