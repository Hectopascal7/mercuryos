package com.mint.mercuryos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class MercuryosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuryosApplication.class, args);
    }

}
