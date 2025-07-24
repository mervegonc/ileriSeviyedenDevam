package com.project.lessons.entities.dataAccess;

import com.project.lessons.entities.City;

import java.util.List;

public interface ICityDal {
    List<City> getAll();
    void add (City city);
    void update(City city);
    void delete(City city);
}
