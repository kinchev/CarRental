package com.company.carrental.repository;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RentalOrder {
   private final  SessionFactory sessionFactory;


   @Autowired
   public RentalOrder(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
