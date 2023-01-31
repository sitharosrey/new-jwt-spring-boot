package com.example.jwt_spring_boot_with_mybatis;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        in = SecuritySchemeIn.HEADER
)
public class JwtSpringBootWithMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSpringBootWithMyBatisApplication.class, args);
    }

}
