package com.wozy.model;

import java.util.Date;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int engine;
    private int year;
    private int hp;
    private int milleage;
    private String color;
    private int damaged;
    private int automated;
    private int fuel;
    private String countryFrom;
    private int price;
    private String url;
    private String image;
    private String region;
    private String city;
    private String description;
    private Date createdAt;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int engine, int year, int hp, int milleage, String color, int damaged,
               int automated, int fuel, String countryFrom, int price, String url, String image, String region,
               String city, String description, Date createdAt) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.hp = hp;
        this.milleage = milleage;
        this.color = color;
        this.damaged = damaged;
        this.automated = automated;
        this.fuel = fuel;
        this.countryFrom = countryFrom;
        this.price = price;
        this.url = url;
        this.image = image;
        this.region = region;
        this.city = city;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMilleage() {
        return milleage;
    }

    public void setMilleage(int milleage) {
        this.milleage = milleage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }

    public int getAutomated() {
        return automated;
    }

    public void setAutomated(int automated) {
        this.automated = automated;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getEngine() == car.getEngine() &&
                getYear() == car.getYear() &&
                getHp() == car.getHp() &&
                getMilleage() == car.getMilleage() &&
                getDamaged() == car.getDamaged() &&
                getAutomated() == car.getAutomated() &&
                getFuel() == car.getFuel() &&
                getPrice() == car.getPrice() &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getCountryFrom(), car.getCountryFrom()) &&
                Objects.equals(getUrl(), car.getUrl()) &&
                Objects.equals(getImage(), car.getImage()) &&
                Objects.equals(getRegion(), car.getRegion()) &&
                Objects.equals(getCity(), car.getCity()) &&
                Objects.equals(getDescription(), car.getDescription()) &&
                Objects.equals(getCreatedAt(), car.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngine(), getYear(), getHp(), getMilleage(), getColor(), getDamaged(), getAutomated(), getFuel(), getCountryFrom(), getPrice(), getUrl(), getImage(), getRegion(), getCity(), getDescription(), getCreatedAt());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", hp=" + hp +
                ", milleage=" + milleage +
                ", color='" + color + '\'' +
                ", damaged=" + damaged +
                ", automated=" + automated +
                ", fuel=" + fuel +
                ", countryFrom='" + countryFrom + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
