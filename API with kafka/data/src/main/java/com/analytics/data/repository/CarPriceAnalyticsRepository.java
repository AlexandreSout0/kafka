package com.analytics.data.repository;

import com.analytics.data.entity.BrandAnalyticsEntity;
import com.analytics.data.entity.CarPriceAnalyticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarPriceAnalyticsRepository extends JpaRepository<CarPriceAnalyticsEntity, Long> {
    Optional<CarPriceAnalyticsEntity> findByPrice(Double price);
}
