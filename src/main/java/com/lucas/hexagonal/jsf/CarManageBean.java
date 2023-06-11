package com.lucas.hexagonal.jsf;

import com.lucas.hexagonal.Car;
import com.lucas.hexagonal.CarSell;
import com.lucas.hexagonal.CarService;

import java.util.List;

public class CarManageBean {

    private final CarService service;

    public CarManageBean(CarService service) {
        this.service = service;
    }

    public List<Car> findAll() {
        return service.findAll();
    }

    public void insert(Car car) {
        service.save(car);
    }

    public void delete(Car car) {
        service.delete();
    }

    public void vistoria(Car car) {
        this.service.vistoria(car);
    }

    public CarSell.CarResponse mudar(Car car) {
        CarSell.CarRequest request = new CarSell.CarRequest();
        return this.service.mudar(request);
    }

    public void modificarCarro(Car car) {
        this.service.modificarCarro(car);
    }

}
