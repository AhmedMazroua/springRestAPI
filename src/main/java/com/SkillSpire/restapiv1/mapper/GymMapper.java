package com.SkillSpire.restapiv1.mapper;

import org.springframework.stereotype.Component;
import com.SkillSpire.restapiv1.DTO.GymDto;
import com.SkillSpire.restapiv1.models.Gym;


@Component
public class GymMapper {
    public static Gym dtoToGym(GymDto dto) {
        Gym gym = new Gym();
        gym.setId(dto.getId());
        gym.setAddress(dto.getAddress());
        gym.setManagerName(dto.getManagerName());
        return gym;
    }

    public static GymDto gymToDto(Gym gym) {
        GymDto dto = new GymDto();
        dto.setId(gym.getId());
        dto.setAddress(gym.getAddress());
        dto.setManagerName(gym.getManagerName());
        return dto;
    }
}
