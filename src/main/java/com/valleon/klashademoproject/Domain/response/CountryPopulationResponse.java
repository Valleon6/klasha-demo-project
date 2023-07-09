package com.valleon.klashademoproject.Domain.response;

import com.valleon.klashademoproject.Domain.model.CountryPopulation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountryPopulationResponse {

    private String error;

    private String msg;

    private CountryPopulation data;

}
