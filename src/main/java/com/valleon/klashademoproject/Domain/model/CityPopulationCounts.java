package com.valleon.klashademoproject.Domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CityPopulationCounts {

    private String year;

    private String value;

    private String sex;

    private String reliability;

}
