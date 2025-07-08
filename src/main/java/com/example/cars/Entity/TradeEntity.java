package com.example.cars.Entity;

import com.example.cars.Constant.Flatform;
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
public class TradeEntity {

    @Id
    @Column
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private CarEntity car;

    @Column
    private String number;

    @Column
    private String name;

    @Column
    private String purchase_date;

    @Column
    private Integer purchase_price;

    @Column
    private String sale_date;

    @Column
    private String sale_price;

    @Column
    @Enumerated(EnumType.STRING)
    private Flatform flatform;
}
