package com.company.carrental.models;


import javax.persistence.*;


@Entity
@Table(name = "rental_order")
public class RentalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rental_id")
    private int rental_id;



    @Column(name="car_id")
    private int car_id;

    public RentalOrder() {
    }

    public int getOrder_id() {
        return rental_id;
    }

    public void setOrder_id(int order_id) {
        this.rental_id = order_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}
