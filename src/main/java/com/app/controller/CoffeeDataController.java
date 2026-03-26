package com.app.controller;

import com.app.entity.CoffeeData;
import com.app.service.CoffeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coffee")
@CrossOrigin(origins = "http://localhost:5173") 
public class CoffeeDataController {

    @Autowired
    private CoffeeDataService coffeeDataService;

    @GetMapping
    public List<CoffeeData> getAllCoffee() {
        return coffeeDataService.getAllCoffee();
    }

    @GetMapping("/{id}")
    public CoffeeData getCoffeeById(@PathVariable int id) {
        return coffeeDataService.getCoffeeById(id);
    }

    @PostMapping
    public CoffeeData addCoffee(@RequestBody CoffeeData coffee) {
        return coffeeDataService.addCoffee(coffee);
    }

    @PutMapping("/{id}")
    public CoffeeData updateCoffee(@PathVariable int id, @RequestBody CoffeeData coffee) {
        return coffeeDataService.updateCoffee(id, coffee);
    }

    @DeleteMapping("/{id}")
    public void deleteCoffee(@PathVariable int id) {
        coffeeDataService.deleteCoffee(id);
    }
}
