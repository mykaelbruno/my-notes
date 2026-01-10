package com.mykael.Notes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(basePackages = "com.mykael.Notes.controllers.api")
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        String message = "Dados inválidos";
        int status = HttpStatus.BAD_REQUEST.value();
        String error = ex.getClass().getSimpleName();

        ErrorResponse errorResponse = new ErrorResponse(message, status, error);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(NotaNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotaNotFound(NotaNotFoundException ex) {
        String message = ex.getMessage();
        int status = HttpStatus.NOT_FOUND.value();
        String error = ex.getClass().getSimpleName();

        ErrorResponse errorResponse = new ErrorResponse(message, status, error);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntime(RuntimeException ex) {
        String message = ex.getMessage();
        int status = HttpStatus.BAD_REQUEST.value();
        String error = ex.getClass().getSimpleName();

        ErrorResponse errorResponse = new ErrorResponse(message, status, error);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGeneric(Exception ex) {
        String message = "Erro interno, tente novamente";
        int status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        String error = ex.getClass().getSimpleName();

        ErrorResponse errorResponse = new ErrorResponse(message, status, error);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
