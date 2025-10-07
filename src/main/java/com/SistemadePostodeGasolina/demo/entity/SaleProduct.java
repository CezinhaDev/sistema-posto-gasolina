package com.SistemadePostodeGasolina.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sale_Product"); // name of the table in database
public class SaleProduct {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // generates automatically
    private Long id;


    @ManyToOne // Many sales can be associated with one product
    private ProductStore product;
    private Integer quantity;
    private BigDecimal totalPrice;
    private LocalDateTime saleDate;

}
