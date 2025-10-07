package com.SistemadePostodeGasolina.demo.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SistemadePostodeGasolina.demo.dto.FuelSaleDTO;
import com.SistemadePostodeGasolina.demo.entity.Fuel;
import com.SistemadePostodeGasolina.demo.repository.FuelRepository;

@Service
public class FuelService {

    private final FuelRepository fuelRepository;

    public FuelService(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    // 🔹 Retorna todos os combustíveis
    public List<Fuel> getAllFuels() {
        return fuelRepository.findAll();
    }

    // 🔹 Retorna combustível por ID
    public Optional<Fuel> getFuelById(Long id) {
        return fuelRepository.findById(id);
    }

    // 🔹 Salva novo combustível
    public Fuel saveFuel(Fuel fuel) {
        return fuelRepository.save(fuel);
    }

    // 🔹 Atualiza combustível existente
    public Fuel updateFuel(Long id, Fuel updatedFuel) {
        return fuelRepository.findById(id)
                .map(fuel -> {
                    fuel.setName(updatedFuel.getName());
                    fuel.setPriceForLiter(updatedFuel.getPriceForLiter());
                    fuel.setQuantityInLiters(updatedFuel.getQuantityInLiters());
                    return fuelRepository.save(fuel);
                })
                .orElseThrow(() -> new RuntimeException("Combustível não encontrado"));
    }

    // 🔹 Exclui combustível
    public void deleteFuel(Long id) {
        fuelRepository.deleteById(id);
    }

    // 🔹 Retorna a quantidade atual em litros (método que você perguntou)
    public BigDecimal getQuantityInLiters(Long id) {
        return fuelRepository.findById(id)
                .map(Fuel::getQuantityInLiters)
                .orElse(BigDecimal.ZERO);
    }

    public Fuel venderCombustivel(Long id, BigDecimal litros) {
        return fuelRepository.findById(id).map(fuel -> {
            BigDecimal novaQuantidade = fuel.getQuantityInLiters().subtract(litros);
            if (novaQuantidade.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Quantidade insuficiente de combustível");
            }
            fuel.setQuantityInLiters(novaQuantidade);
            return fuelRepository.save(fuel);
        }).orElseThrow(() -> new RuntimeException("Combustível não encontrado"));
    }

    public FuelSaleDTO sellFuel(Long id, BigDecimal litros) {
        // 1️⃣ Atualiza o estoque chamando seu método já existente
        Fuel fuel = venderCombustivel(id, litros);

        // 2️⃣ Calcula o valor total da venda
        BigDecimal total = litros.multiply(fuel.getPriceForLiter());

        // 3️⃣ Retorna o DTO com os detalhes da venda
        return new FuelSaleDTO(fuel.getName(), litros, total, null);
    }

}
