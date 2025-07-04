package com.exercicios.exerciciosmysql.controller;

import com.exercicios.exerciciosmysql.model.dto.AtletasRequestDTO;
import com.exercicios.exerciciosmysql.model.entity.Atletas;
import com.exercicios.exerciciosmysql.repository.AtletasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletasController {

    private final AtletasRepository atletasRepository;

    public AtletasController(AtletasRepository atletasRepository) {
        this.atletasRepository = atletasRepository;
    }

    @PostMapping
    public Atletas create(@RequestBody Atletas atleta) {

        return this.atletasRepository.save(atleta);
    }

    @GetMapping("/{id}")
    public Atletas get(@PathVariable Integer id) {
        return this.atletasRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Atletas> get() {
        return this.atletasRepository.findAll();
    }
}
