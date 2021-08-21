package com.company.dsvendas.controller;
import com.company.dsvendas.entities.Seller;
import com.company.dsvendas.entities.dto.SellerDTO;
import com.company.dsvendas.repositories.SaleRepository;
import com.company.dsvendas.repositories.SellerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("sellers")
public class SellerController {

    private final SellerRepository sellerRepository;

    public SellerController(SellerRepository sellerRepository){
        this.sellerRepository = sellerRepository;
    }

    @GetMapping
    public List<SellerDTO> sales(){
        var sellers = sellerRepository.findAll();

        var sellersDTO = sellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());

        return sellersDTO;
    }

}
