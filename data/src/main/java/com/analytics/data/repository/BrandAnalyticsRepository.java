package com.analytics.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analytics.data.entity.BrandAnalyticsEntity;

@Repository
public interface BrandAnalyticsRepository extends JpaRepository<BrandAnalyticsEntity, Long>{
    Optional<BrandAnalyticsEntity> findByBrand(String brand);
}
