package com.app.service;

import com.app.entity.CoffeeData;
import com.app.repository.CoffeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeDataService {

    @Autowired
    private CoffeeDataRepository coffeeDataRepository;

    public List<CoffeeData> getAllCoffee() {
        return coffeeDataRepository.findAll();
    }

    public CoffeeData getCoffeeById(int id) {
        return coffeeDataRepository.findById(id).orElse(null);
    }

    public CoffeeData addCoffee(CoffeeData coffee) {
        return coffeeDataRepository.save(coffee);
    }

    public CoffeeData updateCoffee(int id, CoffeeData coffee) {
        CoffeeData existing = coffeeDataRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(coffee.getName());
            existing.setDescription(coffee.getDescription());
            existing.setPrice(coffee.getPrice());
            return coffeeDataRepository.save(existing);
        }
        return null;
    }

    public void deleteCoffee(int id) {
        coffeeDataRepository.deleteById(id);
    }
}
