package com.SistemadePostodeGasolina.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemadePostodeGasolina.demo.entity.ProductStore;

public interface ProductStoreRepository extends JpaRepository<ProductStore, Long> {

}