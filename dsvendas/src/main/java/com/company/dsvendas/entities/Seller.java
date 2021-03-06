package com.company.dsvendas.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(fetch = FetchType.EAGER,mappedBy = "seller") // Um vendedor tem muitas vendas
    private List<Sale> sales = new ArrayList<>();

    public Seller(){

    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
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
