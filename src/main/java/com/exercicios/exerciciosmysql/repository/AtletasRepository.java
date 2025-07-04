package com.exercicios.exerciciosmysql.repository;

import com.exercicios.exerciciosmysql.model.entity.Atletas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtletasRepository extends JpaRepository<Atletas, Integer> {
}
