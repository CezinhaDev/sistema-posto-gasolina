package com.SistemadePostodeGasolina.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fuel_Sales") // name of the table in database
public class FuelSales {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // generates automatically
    private Long id;

    @ManyToOne // Many sales can be associated with one fuel type
    private Fuel fuel;
    private BigDecimal litersSold;
    private BigDecimal totalPrice;
    private LocalDateTime saleDate;

    public FuelSales() {
    }


    public FuelSales(Long id, Fuel fuel, BigDecimal litersSold, BigDecimal totalPrice, LocalDateTime saleDate) {
        this.id = id;
        this.fuel = fuel;
        this.litersSold = litersSold;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public BigDecimal getLitersSold() {
        return litersSold;
    }

    public void setLitersSold(BigDecimal litersSold) {
        this.litersSold = litersSold;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

}
