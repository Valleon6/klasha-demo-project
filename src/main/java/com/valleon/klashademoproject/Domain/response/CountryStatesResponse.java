package com.valleon.klashademoproject.Domain.response;

import com.valleon.klashademoproject.Domain.model.States;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountryStatesResponse {

    private String error;

    private String msg;

    private States data;
}
