package com.project.lessons.business;


import com.project.lessons.dataAccess.ICityDal;
import com.project.lessons.entities.City;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements  ICityService{

    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public City getByID(int id) {
        return this.cityDal.getByID(id);
    }
}
