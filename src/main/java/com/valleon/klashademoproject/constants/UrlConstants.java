package com.valleon.klashademoproject.constants;

public class UrlConstants {
    /**
     * Get a single city and its cityPopulation data
     * @Body
     * {  "city": "lagos" }
     * @Response
     * {
     *   "error": false,
     *   "msg": "lagos with cityPopulation",
     *   "data": {
     *     "city": "Lagos",
     *     "country": "Nigeria",
     *     "populationCounts": [
     *       {
     *         "year": "1991",
     *         "value": "5195247",
     *         "sex": "Both Sexes",
     *         "reliabilty": "Final figure, complete"
     *       }
     *     ]
     *   }
     * }
     */
    public static final String CITY_POPULATION = "https://countriesnow.space/api/v0.1/countries/population/cities";


    /**
     * Get single country and cityPopulation data
     * @Body
     * {"country": "nigeria" }
     *
     * @Response
     * {
     *   "error": false,
     *   "msg": "Nigeria with cityPopulation",
     *   "data": {
     *     "country": "Nigeria",
     *     "code": "NGA",
     *     "iso3": "NGA",
     *     "populationCounts": [
     *       {
     *         "year": 1960,
     *         "value": 45138458
     *       },
     *       {
     *         "year": 1961,
     *         "value": 46063563
     *       },...
     */
    public static final String COUNTRY_POPULATION = "https://countriesnow.space/api/v0.1/countries/population";


    /**
     * Get a specific country and its capital
     * @Body
     * {"country": "nigeria"}
     * @Response
     * {
     *   "error": false,
     *   "msg": "country and capitals retrieved",
     *   "data": {
     *     "name": "Nigeria",
     *     "capital": "Abuja",
     *     "iso2": "NG",
     *     "iso3": "NGA"
     *   }
     * }
     */
    public static final String COUNTRY_CAPITAL = "https://countriesnow.space/api/v0.1/countries/capital";


    /**
     *gets all the states in a country
     * @Body
     * {"country": "Nigeria"}
     * @Response
     * {
     *   "error": false,
     *   "msg": "states in Nigeria retrieved",
     *   "data": {
     *     "name": "Nigeria",
     *     "iso3": "NGA",
     *     "states": [
     *       {
     *         "name": "Abia State",
     *         "state_code": "AB"
     *       },
     *       {
     *         "name": "Adamawa State",
     *         "state_code": "AD"
     *       },...
     */
    public static final String STATES_IN_COUNTRY = "https://countriesnow.space/api/v0.1/countries/states";



    /**
     * Get cities in a state
     * @Body
     * {"country": "Nigeria","state": "Lagos" }
     * {
     *   "error": false,
     *   "msg": "cities in state Lagos of country Nigeria retrieved",
     *   "data": [
     *     "Apapa",
     *     "Badagry",
     *     "Ebute Ikorodu",
     *     "Ejirin",
     *     "Epe",
     *     "Ikeja",
     *     "Lagos",
     *     "Makoko"
     *   ]
     * }
     */
    public static String CITIES_IN_A_STATE = "https://countriesnow.space/api/v0.1/countries/state/cities";


    /**
     * Get single country and its positions
     * @Body
     * { "country": "nigeria" }
     * @Response
     * {
     *   "error": false,
     *   "msg": "country position retrieved",
     *   "data": {
     *     "name": "Nigeria",
     *     "iso2": "NG",
     *     "long": 8,
     *     "lat": 10
     *   }
     * }
     */
    public static String COUNTRY_LOCATION = "https://countriesnow.space/api/v0.1/countries/positions";


    /**
     * get single country with its ISO2&3 Code
     * @Body
     * {"country": "Nigeria"}
     * @Response
     * {
     *   "error": false,
     *   "msg": "country's ISO code retrieved",
     *   "data": {
     *     "name": "Nigeria",
     *     "Iso2": "NG",
     *     "Iso3": "NGA"
     *   }
     * }
     */
    public static String COUNTRY_ISO2_ISO3 = "https://countriesnow.space/api/v0.1/countries/iso";


    /**
     * Get single country and its currency
     * @Body
     * {"country": "nigeria" }
     * @Response
     * {
     *   "error": false,
     *   "msg": "Nigeria and currency retrieved",
     *   "data": {
     *     "name": "Nigeria",
     *     "currency": "NGN",
     *     "iso2": "NG",
     *     "iso3": "NGA"
     *   }
     */
    public static String COUNTRY_CURRENCY = "https://countriesnow.space/api/v0.1/countries/currency";


    /**
     * Get all cities in a specified country
     * @Body
     * {"country": "nigeria"}
     * @Response
     * {
     *   "error": false,
     *   "msg": "cities in nigeria retrieved",
     *   "data": [
     *     "Aba",
     *     "Abakaliki",
     *     "Abeokuta",
     *     "Abraka",...
     */
    public static String CITIES_IN_A_COUNTRY = "https://countriesnow.space/api/v0.1/countries/cities";
}
