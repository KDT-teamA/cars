package com.example.cars.Controller.Car;

import com.example.cars.DTO.CarDTO;
import com.example.cars.Service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/car")
@CrossOrigin(origins = "http://localhost:3000")
public class CarAPIController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<String> post(@RequestBody CarDTO carDTO) {
        carService.create(carDTO);

        return ResponseEntity.ok("차량 등록 성공");
    }

    @GetMapping
    public ResponseEntity<List<CarDTO>> list() {
        return ResponseEntity.ok(carService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDTO> read(@PathVariable Integer id) {
        return ResponseEntity.ok(carService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Integer id ,@RequestBody CarDTO carDTO) {
        carService.update(id, carDTO);

        return ResponseEntity.ok("정보 수정 성공");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        carService.delete(id);

        return ResponseEntity.ok("정보 삭제 성공");
    }

    @GetMapping("/new")
    public ResponseEntity<CarDTO> newCar() {
        return ResponseEntity.ok(new CarDTO());
    }
}
