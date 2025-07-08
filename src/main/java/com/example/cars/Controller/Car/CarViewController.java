package com.example.cars.Controller.Car;

import com.example.cars.DTO.CarDTO;
import com.example.cars.DTO.TradeDTO;
import com.example.cars.Service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarViewController {

    private final CarService carService;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute(new CarDTO());

        return "car/form";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute(carService.list());

        return "car/list";
    }

    @GetMapping("/{id}")
    public String read(@PathVariable Integer id, Model model) {
        model.addAttribute(carService.read(id));
        model.addAttribute(new TradeDTO());

        return "car/detail";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, Model model) {
        model.addAttribute(carService.read(id));

        return "car/form";
    }
}
