package com.example.cars.Repository;

import com.example.cars.Entity.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<TradeEntity, Integer> {

    List<TradeEntity> findByCar_Id(Integer carId);
}
