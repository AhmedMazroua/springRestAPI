package com.SkillSpire.restapiv1.mapper;

import com.SkillSpire.restapiv1.DTO.UserDto;
import com.SkillSpire.restapiv1.models.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {

    public static UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(userDto.getFirstName());
        userDto.setLastName(userDto.getLastName());
        userDto.setAddress(userDto.getAddress());
        userDto.setGymId(userDto.getGymId());
        return userDto;
    }

    public static User dtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(user.getId());
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setAddress(user.getAddress());
        return user;
    }
}
