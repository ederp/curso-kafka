package com.analytics.data.service;

import org.springframework.stereotype.Service;

import com.analytics.data.dto.CarPostDTO;

@Service
public interface PostAnalyticsService {

    void saveDataAnalytics(CarPostDTO carPostDTO);
}
