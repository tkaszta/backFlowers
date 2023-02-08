package com.example.flowers.web;

import com.example.flowers.model.Flower;
import com.example.flowers.model.FlowerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
class FlowerController {

    private final Logger log = LoggerFactory.getLogger(FlowerController.class);
    private FlowerRepository flowerRepository;

    public FlowerController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping("/viragok")
    String groups() {
        return "SZia";
    }

    @PostMapping("/viragok")
    @ResponseStatus(HttpStatus.CREATED)
    public Flower createTodo(@RequestBody Flower flower) {
        return flowerRepository.save(flower);
    }
}