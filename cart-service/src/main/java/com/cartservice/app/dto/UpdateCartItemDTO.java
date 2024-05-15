package com.cartservice.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCartItemDTO {

    @NotBlank(message = "quantity should not be empty")
    private Integer quantity;
}