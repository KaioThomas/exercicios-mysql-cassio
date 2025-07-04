package com.exercicios.exerciciosmysql.model.dto;

import java.time.LocalDate;

public record TimesRequestDTO(
        String nome,
        String pais,
        LocalDate fundacao
) { }
