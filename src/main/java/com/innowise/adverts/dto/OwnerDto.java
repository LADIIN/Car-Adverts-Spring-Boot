package com.innowise.adverts.dto;

import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDto {
    Integer id;
    String name;
    List<OwnerPhoneDto> phones;
}
