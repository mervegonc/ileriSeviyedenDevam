package com.project.lessons.business;

import com.project.lessons.entities.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add (City city);
    void update(City city);
    void delete(City city);
    City getByID(int id);
}
