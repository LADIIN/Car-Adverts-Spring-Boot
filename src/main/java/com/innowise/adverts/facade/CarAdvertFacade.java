package com.innowise.adverts.facade;


import com.innowise.adverts.dto.CarAdvertDto;
import com.innowise.adverts.model.CarAdvert;
import com.innowise.adverts.service.CarAdvertService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarAdvertFacade {

    private final CarAdvertService carAdvertService;
    private final ModelMapper mapper;

    @Autowired
    public CarAdvertFacade(CarAdvertService carAdvertService, ModelMapper mapper) {
        this.carAdvertService = carAdvertService;
        this.mapper = mapper;
    }

    public Optional<CarAdvertDto> findById(Integer id) {
        Optional<CarAdvertDto> carAdvertDto = Optional.empty();
        Optional<CarAdvert> carAdvertOptional = carAdvertService.findById(id);
        if (carAdvertOptional.isPresent()) {
            carAdvertDto = Optional.of(mapper.map(carAdvertOptional.get(), CarAdvertDto.class));
        }
        return carAdvertDto;
    }
}
