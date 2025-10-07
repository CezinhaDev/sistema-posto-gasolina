package com.SistemadePostodeGasolina.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SistemadePostodeGasolina.demo.dto.FuelSaleDTO;
import com.SistemadePostodeGasolina.demo.entity.Fuel;
import com.SistemadePostodeGasolina.demo.service.FuelService;

@RestController
@RequestMapping("/api/combustiveis")
public class FuelController {

    @Autowired
    private FuelService service;

    @GetMapping
    public List<Fuel> listar() {
        return service.getAllFuels();
    }

    @PostMapping("/vender")
    public FuelSaleDTO vender(@RequestParam Long id, @RequestParam BigDecimal litros) {
        return service.sellFuel(id, litros);
    }

}
