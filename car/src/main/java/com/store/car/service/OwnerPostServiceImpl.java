package com.store.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.car.dto.OwnerPostDTO;
import com.store.car.entity.OwnerPostEntity;
import com.store.car.repository.OwnerPostRepository;

@Service
public class OwnerPostServiceImpl implements OwnerPostService{

    @Autowired
    private OwnerPostRepository ownerPostRepository;

    @Override
    public void createOwnerPost(OwnerPostDTO ownerPostDTO) {
        // TODO Auto-generated method stub
        OwnerPostEntity ownerPost = new OwnerPostEntity();
        ownerPost.setName(ownerPostDTO.getName());
        ownerPost.setType(ownerPostDTO.getType());
        ownerPost.setContactNumber(ownerPostDTO.getContactNumber());

        ownerPostRepository.save(ownerPost);
    }

}
