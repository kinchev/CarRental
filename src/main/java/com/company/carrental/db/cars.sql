create table cars
(
    car_id       int auto_increment
        primary key,
    make         varchar(50) not null,
    model        varchar(50) not null,
    type         varchar(50) not null,
    fuel         varchar(50) not null,
    availability varchar(3)  not null
);

