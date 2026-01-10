package com.mykael.Notes.controllers.api;

import com.mykael.Notes.models.Nota;
import com.mykael.Notes.services.NotaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaApiControler {

    private final NotaService notaService;

    public NotaApiControler(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<Nota> notas() {
        return notaService.listar();
    }

    @PostMapping
    public Nota criar(@Valid @RequestBody Nota nota) {
        return notaService.salvar(nota);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        notaService.deletar(id);
    }
}
