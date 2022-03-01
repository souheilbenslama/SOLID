package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarFormatter implements Formatter
{
    public String getCarsNames(List < Vehicule> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Vehicule car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getCarsName(List<Vehicule> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Vehicule car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
