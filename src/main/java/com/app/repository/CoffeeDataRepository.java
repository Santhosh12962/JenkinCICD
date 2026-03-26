package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.CoffeeData;

@Repository
public interface CoffeeDataRepository extends JpaRepository<CoffeeData, Integer> {

}
