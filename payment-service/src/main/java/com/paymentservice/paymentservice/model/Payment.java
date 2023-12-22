package com.paymentservice.paymentservice.model;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Payment implements Serializable {

    private  Long id;
    private  Long idUser;
    private  Long idProduct;
    private String cardNumber;

    public Long getId() {
        return id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public String getCardNumber() {
        return cardNumber;
    }


}
