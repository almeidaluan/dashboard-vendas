package com.company.dsvendas.entities.dto;

import com.company.dsvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SalerDTO implements Serializable {

    private Long id;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;

    private SellerDTO sellerDTO;

    public SalerDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO sellerDTO) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.sellerDTO = sellerDTO;
    }

    public SalerDTO(Sale entity) {
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.sellerDTO = new SellerDTO(entity.getSeller());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDTO getSellerDTO() {
        return sellerDTO;
    }

    public void setSellerDTO(SellerDTO sellerDTO) {
        this.sellerDTO = sellerDTO;
    }
}
