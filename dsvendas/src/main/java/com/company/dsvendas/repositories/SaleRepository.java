package com.company.dsvendas.repositories;

import com.company.dsvendas.entities.Sale;
import com.company.dsvendas.entities.dto.SaleSuccessDTO;
import com.company.dsvendas.entities.dto.SallerSumDTO;
import com.company.dsvendas.entities.dto.TesteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {


    @Query("SELECT new com.company.dsvendas.entities.dto.SallerSumDTO(obj.seller,SUM(obj.amount))"
            + "FROM com.company.dsvendas.entities.Sale AS obj GROUP BY obj.seller")
    List<SallerSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.company.dsvendas.entities.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))"
            + "FROM com.company.dsvendas.entities.Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();

    @Query(value = "SELECT SUM(amount) FROM tb_sales GROUP BY seller_id", nativeQuery = true)
    List<Double> amountGroupedBySeller02();

    //Para utilizar consultas nativas e bindar a classe eh necessario que a classe nesse caso seja uma interface contendo
    @Query(value = "SELECT SUM(amount) as total FROM tb_sales GROUP BY seller_id", nativeQuery = true)
    List<TesteDTO> amountGroupedBySeller03();
}
