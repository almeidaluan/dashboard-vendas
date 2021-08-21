package com.company.dsvendas.entities.dto;

import com.company.dsvendas.entities.Sale;
import com.company.dsvendas.entities.Seller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SellerDTO implements Serializable {

    private Long id;

    private String name;

    public SellerDTO(){

    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller seller){
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
