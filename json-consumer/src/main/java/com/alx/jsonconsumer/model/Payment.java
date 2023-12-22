package com.alx.jsonconsumer.model;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString()
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
