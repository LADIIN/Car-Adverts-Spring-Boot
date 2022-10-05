package com.innowise.adverts.controller;

import com.innowise.adverts.dto.CarAdvertDto;
import com.innowise.adverts.facade.CarAdvertFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/adverts")
public class CarAdvertController {

    private final CarAdvertFacade carAdvertFacade;

    @Autowired
    public CarAdvertController(CarAdvertFacade carAdvertFacade) {
        this.carAdvertFacade = carAdvertFacade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarAdvertDto> getById(@PathVariable Integer id) {
        Optional<CarAdvertDto> carAdvertDtoOptional = carAdvertFacade.findById(id);
        ResponseEntity<CarAdvertDto> response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        if (carAdvertDtoOptional.isPresent()) {
            response = new ResponseEntity<>(carAdvertDtoOptional.get(), HttpStatus.OK);
        }
        return response;
    }
}
