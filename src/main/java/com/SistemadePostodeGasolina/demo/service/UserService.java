package com.SistemadePostodeGasolina.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SistemadePostodeGasolina.demo.entity.Users;
import com.SistemadePostodeGasolina.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserByName(String name) {
        return (Users) userRepository.findAll();
    }

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }
}
