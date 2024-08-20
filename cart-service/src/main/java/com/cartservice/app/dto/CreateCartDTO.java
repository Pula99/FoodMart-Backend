package com.cartservice.app.dto;

import com.cartservice.app.model.ConfirmationStatus;
import lombok.Data;

import java.util.List;

@Data
public class CreateCartDTO {

    public String userId;
    public ConfirmationStatus confirmationStatus;
}
