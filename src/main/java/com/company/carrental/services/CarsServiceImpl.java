package com.company.carrental.services;


import com.company.carrental.models.Cars;
import com.company.carrental.repository.contracts.CarsRepository;
import com.company.carrental.services.contracts.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    private final CarsRepository carsRepository;

    @Autowired
    public CarsServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }


    @Override
    public void create(Cars car) {
        carsRepository.create(car);
    }

    @Override
    public void edit(Cars car) {
        carsRepository.edit(car);
    }

    @Override
    public List<Cars> getAll() {
        return carsRepository.getAll();
    }
}
