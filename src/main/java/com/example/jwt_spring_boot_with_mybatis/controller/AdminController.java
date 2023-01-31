package com.example.jwt_spring_boot_with_mybatis.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@SecurityRequirement(name = "bearerAuth")
public class AdminController {

    @GetMapping("/hello")
    public String getHelloAdmin(){
        return "Hello Admin !!!";
    }
}
