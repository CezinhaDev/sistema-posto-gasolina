package com.SistemadePostodeGasolina.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemadePostodeGasolina.demo.entity.FuelSales;

public interface SaleFuelRepository extends JpaRepository<FuelSales, Long> {
    
}
