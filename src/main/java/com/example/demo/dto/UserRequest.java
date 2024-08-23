package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class UserRequest {

    @NotNull(message = "user name should not be null")
    private String name ;
    @NotNull(message = "user name should not be null")
    private String address;
    @Email(message = "this is not a correct mail id")
    private String email;
    @Min(value = 23,message = "age is less than 23")
    @Max(value = 60 ,message = "age is more than 60")
    private int age ;

    private double salary ;
}