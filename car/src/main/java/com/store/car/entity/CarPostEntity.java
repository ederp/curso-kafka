package com.store.car.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="car_post")
@Data
@NoArgsConstructor
public class CarPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_model")
    private String model;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_price")
    private Double price;

    @Column(name = "car_description")
    private String description;

    @Column(name = "car_engine")
    private String engineVersion;

    @Column(name = "car_city")
    private String city;

    @Column(name = "car_created")
    private String createdDate;

    @Column(name = "car_post_contact")
    private String contact;

    @ManyToOne
    @JoinColumn(name = "owner-post_id", nullable = false, referencedColumnName = "id")
    private OwnerPostEntity ownerPost;
}
