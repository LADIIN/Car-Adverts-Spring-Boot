package com.innowise.adverts.dto;

import com.innowise.adverts.model.CarState;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarAdvertDto {
    Integer id;
    OwnerDto owner;
    String brand;
    String model;
    Integer year;
    CarState state;
    int mileage;
    int engineVolume;
    int power;
    Timestamp creationDate;
    Timestamp lastEditDate;
    List<ImageDto> images;
}
