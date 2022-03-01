package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarRater implements Rater
{   @Override
    public Vehicule getBestCar(List<Vehicule> cars)
    {
        Vehicule bestCar = null;
        for (Vehicule car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

   
}
