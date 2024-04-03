package com.store.car.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.store.car.dto.CarPostDTO;

@Service
public interface CarPostService {

    void newPostDetails(CarPostDTO carPostDTO);

    List<CarPostDTO> getCarSales();

    void changeCarSale(CarPostDTO carPostDTO, Long postId);

    void removeCarSale(Long postId);
}
