package web.service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> showCars(int count);
    public List<Car> showCars();
}
