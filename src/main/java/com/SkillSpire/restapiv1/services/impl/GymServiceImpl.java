package com.SkillSpire.restapiv1.services.impl;

import com.SkillSpire.restapiv1.mapper.GymMapper;
import com.SkillSpire.restapiv1.models.Gym;
import com.SkillSpire.restapiv1.repositories.GymRepository;
import com.SkillSpire.restapiv1.services.GymService;
import com.SkillSpire.restapiv1.DTO.GymDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GymServiceImpl implements GymService {

    @Autowired
    private GymRepository gymRepository;

    @Override
    public GymDto getGymById(int id) {
        Optional<Gym> gym = gymRepository.findById(id);
        return gym.map(GymMapper::gymToDto).orElse(null);
    }

    @Override
    public GymDto createGym(GymDto gymDto) {
        Gym gym = GymMapper.dtoToGym(gymDto);
        gym = gymRepository.save(gym);
        return GymMapper.gymToDto(gym);
    }

    @Override
    public GymDto updateGymAddress(int id, String newAddress) {
        Gym gym = gymRepository.findById(id).
                orElseThrow(() -> new RuntimeException(
                        "User of this ID does not exist."));

        gym.setAddress(newAddress);
        gymRepository.save(gym);
        return GymMapper.gymToDto(gym);
    }

    @Override
    public GymDto deleteGymById(int id) {
        Gym gym = gymRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Gym with this ID does not exist."));
        gymRepository.delete(gym);
        return null;
    }

    @Override
    public List<GymDto> getAllGyms() {
        return gymRepository.findAll().stream().map(GymMapper::gymToDto).collect(Collectors.toList());
    }
}

