package com.exercicios.exerciciosmysql.controller;

import com.exercicios.exerciciosmysql.model.dto.TimesRequestDTO;
import com.exercicios.exerciciosmysql.model.entity.Times;
import com.exercicios.exerciciosmysql.repository.TimesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimesController {

    private final TimesRepository timesRepository;

    public TimesController(TimesRepository timesRepository) {
        this.timesRepository = timesRepository;
    }

    @PostMapping
    public Times create(@RequestBody Times time) {
        return this.timesRepository.save(time);
    }

    @GetMapping("/{id}")
    public Times get(@PathVariable Integer id) {
        return this.timesRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Times> get() {
        return this.timesRepository.findAll();
    }
}
