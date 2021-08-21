package com.company.dsvendas.entities.dto;

import com.company.dsvendas.entities.Seller;

import java.io.Serializable;

public class SallerSumDTO implements Serializable {

    private String sellName;

    private Double sum;

    public SallerSumDTO(Seller seller,Double sum){
        this.sellName = seller.getName();
        this.sum = sum;
    }

    public String getSellName() {
        return sellName;
    }

    public void setSellName(String sellName) {
        this.sellName = sellName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
