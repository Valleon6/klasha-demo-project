package com.valleon.klashademoproject.Domain.response;

import com.valleon.klashademoproject.Domain.model.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CountryResponse {

        private String error;

        private String msg;

        private Country data;

}
