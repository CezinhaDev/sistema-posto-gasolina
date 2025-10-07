package com.SistemadePostodeGasolina.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_store") // name of the table in database
public class ProductStore {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // generates automatically
    private Long id;

    private String name;
    private BigDecimal priceForUnit;
    private Integer quantityInUnits;

    public ProductStore() {
    }


    public ProductStore(Long id, String name, BigDecimal priceForUnit, Integer quantityInUnits) {
        this.id = id;
        this.name = name;
        this.priceForUnit = priceForUnit;
        this.quantityInUnits = quantityInUnits;
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

    public BigDecimal getPriceForUnit() {
        return priceForUnit;
    }

    public void setPriceForUnit(BigDecimal priceForUnit) {
        this.priceForUnit = priceForUnit;
    }

    public Integer getQuantityInUnits() {
        return quantityInUnits;
    }

    public void setQuantityInUnits(Integer quantityInUnits) {
        this.quantityInUnits = quantityInUnits;
    }

}
