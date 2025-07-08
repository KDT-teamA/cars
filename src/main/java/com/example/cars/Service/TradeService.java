package com.example.cars.Service;

import com.example.cars.DTO.TradeDTO;
import com.example.cars.Entity.CarEntity;
import com.example.cars.Entity.TradeEntity;
import com.example.cars.Repository.CarRepository;
import com.example.cars.Repository.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TradeService {

    private final TradeRepository tradeRepository;
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public void create(Integer car_id ,TradeDTO tradeDTO) {
        CarEntity carEntity = carRepository.findById(car_id).get();
        TradeEntity tradeEntity = modelMapper.map(tradeDTO, TradeEntity.class);
        tradeEntity.setCar(carEntity);
        tradeRepository.save(tradeEntity);
    }

    public TradeDTO read(Integer id) {
        return modelMapper.map(tradeRepository.findById(id), TradeDTO.class);
    }

    public TradeDTO read_by_car_id(Integer car_id) {
        return modelMapper.map(tradeRepository.findByCar_Id(car_id), TradeDTO.class);
    }

    public void update(Integer id, TradeDTO tradeDTO) {
        TradeEntity tradeEntity = tradeRepository.findById(id).get();
        tradeEntity.setPurchase_date(tradeDTO.getPurchase_date());
        tradeEntity.setPurchase_price(tradeDTO.getPurchase_price());
        tradeEntity.setSale_date(tradeDTO.getSale_date());
        tradeEntity.setSale_price(tradeDTO.getSale_price());
        tradeEntity.setFlatform(tradeDTO.getFlatform());
    }

    public void delete(Integer id) {
        tradeRepository.deleteById(id);
    }
}
