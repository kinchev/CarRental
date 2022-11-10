package com.company.carrental.repository;


import com.company.carrental.models.Cars;
import com.company.carrental.repository.contracts.CarsRepository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import java.util.List;



@Repository
public class CarsRepositoryImpl implements CarsRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public CarsRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void create(Cars car) {
        try (Session session = sessionFactory.openSession()) {
            session.save(car);
        }
    }

    @Override
    public void edit(Cars car) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(car);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Cars> getAll() {
        try(Session session=sessionFactory.openSession()){
            Query<Cars> query=session.createQuery("from Cars",Cars.class);
            return  query.list();
        }


    }
}
