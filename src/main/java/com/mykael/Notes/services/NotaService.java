package com.mykael.Notes.services;

import com.mykael.Notes.exceptions.NotaNotFoundException;
import com.mykael.Notes.models.Nota;
import com.mykael.Notes.repository.NotaRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {
    private NotaRepository notaRepository;

    public NotaService(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    public List<Nota> listar() {
        return notaRepository.findAll();
    }

    public Nota salvar(Nota nota) {
        return notaRepository.save(nota);
    }

    public void deletar(Long id) {
        verificaNota(id);
        notaRepository.deleteById(id);
    }

    public void verificaNota(Long id) {
        if (!notaRepository.existsById(id)) throw new NotaNotFoundException(id);
    }

}
