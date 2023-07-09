package com.valleon.klashademoproject.exceptions;

public class CurrencyNotFoundException extends CountriesAndCitiesApiException {

    private static final Long serialVersionUID = 1L;

    private static final String ENTITY_NAME = "Currency";

    private final Object objectId;

    public CurrencyNotFoundException(Object objectId) {
        this.objectId = objectId;
    }

    @Override
    public String getMessage() {
        return String.format("%s of %s cannot be found in record.", ENTITY_NAME, objectId);
    }
}
