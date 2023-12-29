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
public class OwnerPostDTO {         //Data Transfer Objet --> [Obejeto de tranferencia de dados]

    private  String name;
    private String type;
    private String contactNumber;

}
