package com.SkillSpire.restapiv1.mapper;

import com.SkillSpire.restapiv1.DTO.UserDto;
import com.SkillSpire.restapiv1.models.User;

public class UserMapper {
    public static User dtoToUser(UserDto userDto) {
        User user = new User(
        userDto.getFirstName(),
        userDto.getLastName(),
        userDto.getAddress()
        );
        return user;
    }

    public static UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(userDto.getFirstName());
        userDto.setLastName(userDto.getLastName());
        userDto.setAddress(userDto.getAddress());
        return userDto;
    }
}
