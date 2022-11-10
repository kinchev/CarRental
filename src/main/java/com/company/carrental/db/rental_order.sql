create table rental_order
(
    rental_id int auto_increment
        primary key,
    car_id    int null,
    constraint rental_order_cars_fk
        foreign key (car_id) references cars (car_id)
);

