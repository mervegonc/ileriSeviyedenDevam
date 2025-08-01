package com.project.lessons.dataAccess;

import com.project.lessons.entities.City;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateCityDal implements ICityDal{

    EntityManager entityManager;

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<City> cities = session.createQuery("from City", City.class).getResultList();
        return cities;
    }

    @Override
    public void add(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(city);
    }

    @Override
    public City getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        City city = session.get(City.class, id);
        return city;
    }
}
