package com.company.carrental.controllers;


import com.company.carrental.models.Cars;
import com.company.carrental.services.contracts.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;



@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public List<Cars> getAll() {
        return carsService.getAll();
    }

    @PostMapping("/create")
    public Cars create(@RequestBody Cars car) {
        carsService.create(car);
        return car;

    }


    @PutMapping("/edit")
    public Cars edit(@RequestBody Cars car) {
        carsService.edit(car);
        return car;
    }

}

