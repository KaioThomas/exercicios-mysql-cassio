package com.exercicios.exerciciosmysql.repository;

import com.exercicios.exerciciosmysql.model.entity.Times;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesRepository extends JpaRepository<Times, Integer> {
}
