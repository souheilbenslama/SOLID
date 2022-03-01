package com.directi.training.srp.exercise_refactored;

import java.util.List;

public interface DAO {
    
    public Vehicule findById(String carId) ;

    public List<Car> findAll() ; 
}
