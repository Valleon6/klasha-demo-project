package com.valleon.klashademoproject.Domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CountryPopulationCounts {

    private Long year;
    private Long value;

}
