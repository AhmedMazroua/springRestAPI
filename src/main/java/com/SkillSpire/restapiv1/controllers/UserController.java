package com.SkillSpire.restapiv1.controllers;


import com.SkillSpire.restapiv1.DTO.UserDto;
import com.SkillSpire.restapiv1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST request to create a new user
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.createUser(userDto);
        return ResponseEntity.ok(createdUser);
    }

    // GET request to retrieve a user by ID
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
        UserDto user = userService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    // PUT request to update a user's address
    @PutMapping("/{id}/address")
    public ResponseEntity<UserDto> updateUserAddress(@PathVariable int id, @RequestBody String newAddress) {
        UserDto updatedUser = userService.updateUserAddress(id, newAddress);
        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
    }
}