package com.example.cars.DTO;

import com.example.cars.Entity.TradeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private Integer id;

    private TradeDTO trade;

    private String number; //차량번호

    private String name; //차량이름

    private String manufacturer; //제조사

    private Integer mileage; //주행거리

    private String registration_date; //차량등록일
}
