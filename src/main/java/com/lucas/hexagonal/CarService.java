package com.lucas.hexagonal;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;

@Service
public class CarService {

    private final Garage garage;

    private final Detran detran;
    private CarSell carSell;
    private CarVistoria carVistoria;
    private CarAlteracaoVeicular carAlteracaoVeicular;


    public CarService(Garage garage, Detran detran) {
        this.garage = garage;
        this.detran = detran;
    }

    public void delete() {
        garage.delete();
    }

    public void save(Car car) {
        garage.save(car);
    }

    public List<Car> findAll() {
        return garage.findAll();
    }

    public void modificarCarro(Car car) {
    }

    public CarSell.CarResponse mudar(CarSell.CarRequest carRequest) {
        return carSell.mudar(carRequest);
    }

    public void vistoria(Car car) {
    }
}
