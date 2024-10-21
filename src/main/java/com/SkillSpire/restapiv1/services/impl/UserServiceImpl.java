package com.SkillSpire.restapiv1.services.impl;

import com.SkillSpire.restapiv1.models.User;
import com.SkillSpire.restapiv1.repositories.UserRepository;
import com.SkillSpire.restapiv1.services.UserService;
import com.SkillSpire.restapiv1.DTO.UserDto;
import com.SkillSpire.restapiv1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(UserMapper::userToDto).orElse(null);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.dtoToUser(userDto);
        user = userRepository.save(user);
        return UserMapper.userToDto(user);
    }

    @Override
    public UserDto updateUserAddress(int id, String newAddress) {
       User user = userRepository.findById(id).
               orElseThrow( () -> new RuntimeException(
                       "User of this ID does not exist."));

            user.setAddress(newAddress);
            userRepository.save(user);
            return UserMapper.userToDto(user);
    }
}