package com.example.cars.DTO;

import com.example.cars.Constant.Flatform;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TradeDTO {
    private Integer id;

    private String purchase_date;

    private Integer purchase_price;

    private String sale_date;

    private String sale_price;

    private Flatform flatform;
}
