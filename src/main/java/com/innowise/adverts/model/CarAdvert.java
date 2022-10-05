package com.innowise.adverts.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adverts")
public class CarAdvert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private String brand;

    private String model;

    private Integer year;

    @Enumerated(EnumType.STRING)
    private CarState state;

    private int mileage;

    @Column(name = "engine_volume")
    private int engineVolume;

    private int power;

    @Column(name = "creation_date")
    private Timestamp creationDate;

    @Column(name = "editing_date")
    private Timestamp lastEditDate;

    @JoinColumn(name = "advert_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Image> images;
}
