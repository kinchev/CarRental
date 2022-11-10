package com.company.carrental.repository.contracts;

import com.company.carrental.models.Cars;

import java.util.List;

public interface CarsRepository {

    void create(Cars car);

    void edit(Cars car);

    List<Cars> getAll();


}
