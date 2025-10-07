package com.SistemadePostodeGasolina.demo.dto;

import java.math.BigDecimal;

public class FuelDTO {
    private Long id;
    private String name;
    private BigDecimal priceForLiter;
    private BigDecimal quantityInLiters;

    // Construtor padrão
    public FuelDTO() {}

    // Construtor com entidade (facilita conversão)
    public FuelDTO(Long id, String name, BigDecimal priceForLiter, BigDecimal quantityInLiters) {
        this.id = id;
        this.name = name;
        this.priceForLiter = priceForLiter;
        this.quantityInLiters = quantityInLiters;
    }

    // Getters e Setters
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
