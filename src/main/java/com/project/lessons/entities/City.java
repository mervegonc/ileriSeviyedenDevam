package com.project.lessons.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="countryCode")
    private String countryCode;

    @Column(name="district")
    private String district;

    @Column(name="population")
    private int population;

    public City() {
    }

    public City(int population, String district, String countryCode, String name, int id) {
        this.population = population;
        this.district = district;
        this.countryCode = countryCode;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
