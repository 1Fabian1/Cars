package com.wozy.model;

public class QueryBuilder {

    public String produceString(String urlAddress, Car car){

        StringBuilder builder = new StringBuilder(urlAddress);

        if (car.getBrand() != null || !car.getBrand().isEmpty()) {
            builder.append("brand:");
            builder.append(car.getBrand());

        }
        if (car.getModel() != null || !car.getModel().isEmpty()) {
            builder.append("+");
            builder.append("model");
            builder.append(car.getModel());
        }
        if (car.getEngine() != 0) {
            builder.append("+");
            builder.append("engine");
            builder.append(car.getEngine());
        }
        builder.append("?");

        return builder.toString();
    }
}
