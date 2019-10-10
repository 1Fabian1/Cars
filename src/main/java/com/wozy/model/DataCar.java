package com.wozy.model;

import java.util.List;
import java.util.Objects;

public class DataCar {

    private List<Car> Cars;


    public DataCar(List<Car> cars) {
        Cars = cars;
    }

    public List<Car> getCars() {
        return Cars;
    }

    public void setCars(List<Car> cars) {
        Cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataCar)) return false;
        DataCar dataCar = (DataCar) o;
        return Objects.equals(getCars(), dataCar.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCars());
    }

    @Override
    public String toString() {
        return "DataCar{" +
                "Cars=" + Cars +
                '}';
    }
}
