package com.SistemadePostodeGasolina.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fuel") // name of the table in database
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generates automatically
    private Long id;

    private String name;
    private BigDecimal priceForLiter;
    private BigDecimal quantityInLiters;

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

    public BigDecimal getPriceForLiter() {
        return priceForLiter;
    }

    public void setPriceForLiter(BigDecimal priceForLiter) {
        this.priceForLiter = priceForLiter;
    }

    public BigDecimal getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(BigDecimal quantityInLiters) {
        this.quantityInLiters = quantityInLiters;
    }

}
