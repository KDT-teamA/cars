package com.example.cars.Controller.Trade;

import com.example.cars.Service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TradeAPIController {

    private final TradeService tradeService;


}
