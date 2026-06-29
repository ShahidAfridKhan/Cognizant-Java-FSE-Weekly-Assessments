package com.example.week3;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private final CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{code}")
    public ResponseEntity<Country> findByCode(@PathVariable String code) {
        Optional<Country> country = repository.findById(code.toUpperCase());
        return country.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
