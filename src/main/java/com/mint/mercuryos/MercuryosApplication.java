package com.mint.mercuryos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication(scanBasePackages = {"com.mint.mercuryos"})
public class MercuryosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuryosApplication.class, args);
    }

}
