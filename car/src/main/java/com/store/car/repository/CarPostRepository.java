package com.store.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.car.entity.CarPostEntity;

@Repository
public interface CarPostRepository extends JpaRepository<CarPostEntity, Long>{

}
