package com.store.car.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.car.dto.CarPostDTO;
import com.store.car.entity.CarPostEntity;
import com.store.car.repository.CarPostRepository;

@Service
public class CarPostServiceImpl implements CarPostService{

    @Autowired
    private CarPostRepository carPostRepository;

    @Override
    public void newPostDetails(CarPostDTO carPostDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newPostDetails'");
    }

    @Override
    public List<CarPostDTO> getCarSales() {
        // TODO Auto-generated method stub
        List<CarPostDTO> listCarSales = new ArrayList<>();
        carPostRepository.findAll().forEach(item ->{
            listCarSales.add(mapCarEntityToDTO(item));
        });
        return listCarSales;
    }

    @Override
    public void changeCarSale(CarPostDTO carPostDTO, Long postId) {
        // TODO Auto-generated method stub
        carPostRepository.findById(postId).ifPresentOrElse(item ->{
            item.setDescription(carPostDTO.getDescription());
            item.setContact(carPostDTO.getContact());
            item.setPrice(carPostDTO.getPrice());
            item.setBrand(carPostDTO.getBrand());
            item.setEngineVersion(carPostDTO.getEngineVersion());
            item.setModel(carPostDTO.getModel());

            carPostRepository.save(item);
        }, () ->{
            throw new NoSuchElementException();
        });
    }

    @Override
    public void removeCarSale(Long postId) {
        // TODO Auto-generated method stub
        carPostRepository.deleteById(postId);
    }

    private CarPostDTO mapCarEntityToDTO(CarPostEntity carPostEntity) {
        // TODO Auto-generated method stub
        return CarPostDTO.builder()
                .brand(carPostEntity.getBrand())
                .city(carPostEntity.getCity())
                .model(carPostEntity.getModel())
                .description(carPostEntity.getDescription())
                .engineVersion(carPostEntity.getEngineVersion())
                .createdDate(carPostEntity.getCreatedDate())
                .ownerName(carPostEntity.getOwnerPost().getName())
                .price(carPostEntity.getPrice()).build();
    }

}
