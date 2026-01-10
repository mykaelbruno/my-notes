package com.mykael.Notes.repository;

import com.mykael.Notes.models.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
