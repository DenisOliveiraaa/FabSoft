package br.unisales.fabsoft.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudantesRepository extends JpaRepository<Estudantes, Long>{
    
}

