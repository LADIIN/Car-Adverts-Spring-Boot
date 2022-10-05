package com.innowise.adverts.repository;

import com.innowise.adverts.model.CarAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarAdvertRepository extends JpaRepository<CarAdvert, Integer> {

}
