package com.store.car.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Target;

@Entity
@Table(name="car_post")
@Data
@NoArgsConstructor
public class CarPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
    private Long ownerId;
    @Column(name = "car_created")
    private String createdDate;
    @Column(name = "owner_name")
    private String ownerName;
    private String ownerType;
    @Column(name = "car_post_contact")
    private String contact;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public OwnerPostEntity getOwnerPost() {
        return ownerPost;
    }

    public void setOwnerPost(OwnerPostEntity ownerPost) {
        this.ownerPost = ownerPost;
    }

    @ManyToOne
    @JoinColumn (name = "owner_post_id", nullable = false, referencedColumnName = "id")
    private OwnerPostEntity ownerPost ;

}
