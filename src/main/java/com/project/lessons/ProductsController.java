package com.project.lessons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {

    @GetMapping("/get")
    public String get() {
        return "me";
    }
}
