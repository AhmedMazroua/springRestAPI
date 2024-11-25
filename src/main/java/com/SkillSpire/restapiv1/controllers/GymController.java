package com.SkillSpire.restapiv1.controllers;

import com.SkillSpire.restapiv1.DTO.GymDto;
import com.SkillSpire.restapiv1.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/gyms")
@RequiredArgsConstructor
public class GymController {

    @Autowired
    private GymService gymService;

    // POST request to create a new gym
    @PostMapping
    public ResponseEntity<GymDto> createGym(@RequestBody GymDto gymDto) {
        GymDto createdGym = gymService.createGym(gymDto);
        return ResponseEntity.ok(createdGym);
    }

    // GET request to retrieve a gym by ID
    @PutMapping("/{id}")
    public GymDto updateGym(@PathVariable Integer id, @RequestBody String newAddress) {
        return gymService.updateGymAddress(id, newAddress);
    }

    // PUT request to get gym by id
    @GetMapping("/{id}")
    public GymDto getGymById(@PathVariable Integer id) {
        return gymService.getGymById(id);
    }

    // GET ALL request to retrieve all gyms
    @GetMapping
    public List<GymDto> getAllGyms() {
        return gymService.getAllGyms();
    }

    // DELETE request to delete gyms by id
    @DeleteMapping("/{id}")
    public void deleteGymById(@PathVariable Integer id) {
        gymService.deleteGymById(id);
    }

    @GetMapping("/{id}/users")
    public ResponseEntity<GymDto> getGymWithUsers(@PathVariable int id) {
        GymDto gym = gymService.getGymById(id);
        return ResponseEntity.ok(gym);
    }
}
