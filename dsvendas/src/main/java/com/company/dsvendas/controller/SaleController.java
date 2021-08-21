package com.company.dsvendas.controller;


import com.company.dsvendas.entities.Sale;
import com.company.dsvendas.entities.dto.SaleSuccessDTO;
import com.company.dsvendas.entities.dto.SalerDTO;
import com.company.dsvendas.entities.dto.SallerSumDTO;
import com.company.dsvendas.entities.dto.TesteDTO;
import com.company.dsvendas.repositories.SaleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("sales")
public class SaleController {

    private final SaleRepository saleRepository;

    public SaleController(SaleRepository saleRepository){
        this.saleRepository = saleRepository;
    }

    @GetMapping
    public Page<SalerDTO> sales(Pageable pageable){
        var sales = saleRepository.findAll(pageable);
        return sales.map( x -> new SalerDTO(x));

    }

    @GetMapping("/amount-by-seller")
    public List<SallerSumDTO> amountGroupBySeller(){
        var amount = saleRepository.amountGroupedBySeller();
        return amount;

    }

    @GetMapping("/amount-by-seller02")
    public List<Double> amountGroupBySeller02(){
        var amount = saleRepository.amountGroupedBySeller02();
        return amount;
    }

    @GetMapping("/success-saller")
    public List<SaleSuccessDTO> sucessGroupBySeller(){
        var amount = saleRepository.successGroupBySeller();
        return amount;
    }

    @GetMapping("/teste")
    public List<TesteDTO> sucessGroupBySeller03(){
        var amount = saleRepository.amountGroupedBySeller03();
        return amount;
    }
}
