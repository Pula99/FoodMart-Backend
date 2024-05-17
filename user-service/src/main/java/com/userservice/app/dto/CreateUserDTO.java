package com.userservice.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateUserDTO {

    @NotBlank(message = "User name should not be empty")
    private String userName;

    @NotBlank(message = "User email should not be empty")
    private String email;

    @NotBlank(message = "User address should not be empty")
    private String address;

    @NotBlank(message = "User contactNumber should not be empty")
    private Long contactNumber;

}