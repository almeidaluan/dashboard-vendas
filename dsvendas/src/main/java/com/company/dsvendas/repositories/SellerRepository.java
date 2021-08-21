package com.company.dsvendas.repositories;

import com.company.dsvendas.entities.Seller;
import com.company.dsvendas.entities.dto.SalerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {


}
