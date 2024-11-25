package com.SkillSpire.restapiv1.mapper;

import org.springframework.stereotype.Component;
import com.SkillSpire.restapiv1.DTO.GymDto;
import com.SkillSpire.restapiv1.models.Gym;

import java.util.stream.Collectors;


@Component
public class GymMapper {

    public static GymDto gymToDto(Gym gym) {
        GymDto dto = new GymDto();
        dto.setId(Math.toIntExact(gym.getId()));
        dto.setAddress(gym.getAddress());
        dto.setManagerName(gym.getManagerName());
        dto.setUsers(gym.getUsers().stream().map(UserMapper::userToDto).collect(Collectors.toList()));
        return dto;
    }
    public static Gym dtoToGym(GymDto dto) {
        Gym gym = new Gym();
        gym.setId(Long.valueOf(dto.getId()));
        gym.setAddress(dto.getAddress());
        gym.setManagerName(dto.getManagerName());
        return gym;
    }

}
