package com.SistemadePostodeGasolina.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.SistemadePostodeGasolina.demo.entity.Users;
import com.SistemadePostodeGasolina.demo.service.UserService;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{name}")
    public Users getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userService.saveUser(user);
    }
}
