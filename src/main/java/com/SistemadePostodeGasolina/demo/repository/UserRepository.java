package com.SistemadePostodeGasolina.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemadePostodeGasolina.demo.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByName(String name);
}
