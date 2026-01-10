package com.mykael.Notes.exceptions;

public class NotaNotFoundException extends RuntimeException {
    public NotaNotFoundException(Long id) {
        super("Anotação de id " + id + " não encontrada.");
    }
}
