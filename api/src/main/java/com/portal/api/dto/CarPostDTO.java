package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Com essa anotação eu não preciso criar os Getters and Setters
@Builder // Com essa anotação eu não preciso criar o o Construtor com todos Objetos
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class CarPostDTO { //Data Transfer Objet --> [Obejeto de tranferencia de dados]
    private String model;
    private String brand;
    private String price;
    private String description;
    private String engineVersion;
    private String city;
    private Long ownerId;
    private String createdDate;
    private String ownerName;
    private String ownerType;
    private String contact;

//    public OwnerPostDTO(String model, String brand, String price, String description, String engineVersion, String city, Long ownerId, String createdDate, String ownerName, String ownerType, String contact) {
//        this.model = model;
//        this.brand = brand;
//        this.price = price;
//        this.description = description;
//        this.engineVersion = engineVersion;
//        this.city = city;
//        this.ownerId = ownerId;
//        this.createdDate = createdDate;
//        this.ownerName = ownerName;
//        this.ownerType = ownerType;
//        this.contact = contact;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getEngineVersion() {
//        return engineVersion;
//    }
//
//    public void setEngineVersion(String engineVersion) {
//        this.engineVersion = engineVersion;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public Long getOwnerId() {
//        return ownerId;
//    }
//
//    public void setOwnerId(Long ownerId) {
//        this.ownerId = ownerId;
//    }
//
//    public String getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(String createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public String getOwnerType() {
//        return ownerType;
//    }
//
//    public void setOwnerType(String ownerType) {
//        this.ownerType = ownerType;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
}
