package com.SistemadePostodeGasolina.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemadePostodeGasolina.demo.entity.SaleProduct;

public interface VendaProdutoRepository extends JpaRepository<SaleProduct, Long> {

    
}