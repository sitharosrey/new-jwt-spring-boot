package com.example.jwt_spring_boot_with_mybatis.model;

import lombok.Data;

@Data
public class UserRequest {
    private String email;
    private String password;
}
