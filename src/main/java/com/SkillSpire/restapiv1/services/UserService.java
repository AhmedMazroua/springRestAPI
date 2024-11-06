package com.SkillSpire.restapiv1.services;

import com.SkillSpire.restapiv1.DTO.UserDto;

import java.util.List;

public interface UserService {


    UserDto getUserById(int id);

    UserDto createUser(UserDto userDto);

    UserDto updateUserAddress(int id, String newAddress);

    UserDto deleteUserById( int id);

    List<UserDto> getAllUsers();

}
