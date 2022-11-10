package com.company.carrental.models;


import javax.persistence.*;


@Entity
@Table(name="cars")
public class Cars {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private int car_id;



    @OneToOne
    @JoinColumn(name="car_id")
    private RentalOrder rentalOrder;



    @Column(name="make")
    private String make;

    @Column(name="model")
    private String model;

    @Column(name="type")
    private String type;

    @Column(name="fuel")
    private String fuel;

    @Column(name="availability")
    private String availability;



    public Cars(){

    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public RentalOrder getRentalOrder() {
        return rentalOrder;
    }

    public void setRentalOrder(RentalOrder rentalOrder) {
        this.rentalOrder = rentalOrder;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }



}
