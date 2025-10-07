package com.SistemadePostodeGasolina.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FuelSaleDTO {
    private String fuelName;
    private BigDecimal litersSold;
    private BigDecimal totalValue;
    private LocalDateTime saleDate;

    public FuelSaleDTO() {}

    public FuelSaleDTO(String fuelName, BigDecimal litersSold, BigDecimal totalValue, LocalDateTime saleDate) {
        this.fuelName = fuelName;
        this.litersSold = litersSold;
        this.totalValue = totalValue;
        this.saleDate = saleDate;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }

    public BigDecimal getLitersSold() {
        return litersSold;
    }

    public void setLitersSold(BigDecimal litersSold) {
        this.litersSold = litersSold;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }
}
