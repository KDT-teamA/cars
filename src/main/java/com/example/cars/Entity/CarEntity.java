package com.example.cars.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private TradeEntity trade;

    @Column
    private String number;

    @Column
    private String name;

    @Column
    private String manufacturer;

    @Column
    private Integer mileage;

    @Column
    private String registration_date;
}
