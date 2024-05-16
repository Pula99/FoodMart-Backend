package com.productservice.app.controller;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public abstract class AbstractProductController {

    protected <T> ResponseEntity<T> sendSuccessResponse(T response) {
        return ResponseEntity.ok(response);
    }

    protected <T> ResponseEntity<T> sendCreatedResponse(T response) {
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    protected <T> ResponseEntity<T> sendUpdatedResponse(T response) {
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    protected <T> ResponseEntity<T> sendNoContentResponse(T response) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }


}
