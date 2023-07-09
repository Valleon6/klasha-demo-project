package com.valleon.klashademoproject.Domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country {

    private Long id;

    private String name;

    private List<CityPopulation> cityPopulationCounts;

    private String capital;

    private String countryLocation;

    private String currency;

    private List<States> states;

    private Location Location;

    private String iso2;

    private String iso3;

}
