package com.valleon.klashademoproject;

import com.valleon.klashademoproject.constants.CsvCurrencyConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
//@EnableSwagger2WebMvc
@Import(CsvCurrencyConstants.class)
public class KlashaDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlashaDemoProjectApplication.class, args);
        loadCurrencyConstants(); // This calls the method to load currency constants

    }
    private static void loadCurrencyConstants() {
        CsvCurrencyConstants currencyConstants = new CsvCurrencyConstants();
        currencyConstants.init();
    }


}
