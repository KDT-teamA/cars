package com.example.cars.Service;

import com.example.cars.DTO.CarDTO;
import com.example.cars.Entity.CarEntity;
import com.example.cars.Repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CarService {

    public final CarRepository carRepository;
    public final ModelMapper modelMapper;

    public void create(CarDTO carDTO) {
        carRepository.save(modelMapper.map(carDTO, CarEntity.class));
    }

    public List<CarDTO> list() {
        return Arrays.asList(modelMapper.map(carRepository.findAll(), CarDTO[].class));
    }

    public CarDTO read(Integer id) {
        return modelMapper.map(carRepository.findById(id), CarDTO.class);
    }

    public void update(Integer id ,CarDTO carDTO) {
        CarEntity read = carRepository.findById(id).get();
        read.setName(carDTO.getName());
        read.setNumber(carDTO.getNumber());
        read.setManufacturer(carDTO.getManufacturer());
        read.setMileage(carDTO.getMileage());
        read.setRegistration_date(carDTO.getRegistration_date());
    }

    public void delete(Integer id) {
        carRepository.deleteById(id);
    }
}
