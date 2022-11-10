package com.company.carrental.services.contracts;

import com.company.carrental.models.Cars;

import java.util.List;

public interface CarsService {

    void create(Cars car);

    void edit(Cars car);

    List<Cars> getAll();
}
