package com.innowise.adverts.service;

import com.innowise.adverts.model.CarAdvert;
import com.innowise.adverts.repository.CarAdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarAdvertService {

    private CarAdvertRepository carAdvertRepository;

    @Autowired
    public CarAdvertService(CarAdvertRepository carAdvertRepository) {
        this.carAdvertRepository = carAdvertRepository;
    }

    public Optional<CarAdvert> findById(Integer id) {
        return carAdvertRepository.findById(id);
    }

}
