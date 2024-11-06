package com.SkillSpire.restapiv1.services;

import com.SkillSpire.restapiv1.DTO.GymDto;

import java.util.List;

public interface GymService {
    GymDto getGymById(int id);

    GymDto createGym(GymDto gymDto);

    GymDto deleteGymById(int id);

    GymDto updateGymAddress(int id, String newAddress);

    List<GymDto> getAllGyms();
}
