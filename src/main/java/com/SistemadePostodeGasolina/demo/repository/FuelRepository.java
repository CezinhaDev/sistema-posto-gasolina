package com.SistemadePostodeGasolina.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemadePostodeGasolina.demo.entity.Fuel;

public interface FuelRepository extends JpaRepository<Fuel, Long> {

}
