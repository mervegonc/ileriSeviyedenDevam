package com.project.lessons.restApi;

import com.project.lessons.business.ICityService;
import com.project.lessons.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {


    private ICityService cityService;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city){
cityService.add(city);
    }
    @PutMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }

    @GetMapping("/cities{id}")
    public City getBuId(@PathVariable int id){
        return cityService.getByID(id);
    }
}
