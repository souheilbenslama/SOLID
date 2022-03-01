package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final CarDao _carDao;
    private final Formatter _carFormatter;
    private final Rater _carRater;

    public CarManager(CarDao carDao, Formatter carFormatter, Rater carRater)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return _carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Vehicule getBestCar()
    {
        return _carRater.getBestCar(_carDao.findAll());
    }
}
