package com.example.cars.Controller.Trade;

import com.example.cars.DTO.TradeDTO;
import com.example.cars.Service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/trade")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeAPIController {

    private final TradeService tradeService;

    @PostMapping("/{car_id}")
    public ResponseEntity<String> create(@PathVariable Integer car_id, @RequestBody TradeDTO tradeDTO) {
        tradeService.create(car_id, tradeDTO);

        return ResponseEntity.ok("거래 정보 등록 성공");
    }

    @GetMapping("/{id}")
    public ResponseEntity<TradeDTO> read(@PathVariable Integer id) {
        return ResponseEntity.ok(tradeService.read(id));
    }
}
