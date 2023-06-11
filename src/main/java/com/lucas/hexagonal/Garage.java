package com.lucas.hexagonal;

import org.jmolecules.ddd.annotation.Repository;

import java.util.List;

@Repository
public interface Garage {
    void delete();

    void save(Car car);

    List<Car> findAll();
}
