package com.store.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.car.entity.OwnerPostEntity;

@Repository
public interface OwnerPostRepository extends JpaRepository<OwnerPostEntity, Long>{

}
