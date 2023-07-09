package com.valleon.klashademoproject.Domain.response;

import com.valleon.klashademoproject.Domain.model.Iso2And3;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Iso2And3Response {

    private String error;

    private String msg;

    private Iso2And3 data;


}
