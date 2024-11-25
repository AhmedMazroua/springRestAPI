package com.SkillSpire.restapiv1.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDto {
    private String firstName;
    private String lastName;
    private String address;
    private int gymId;
}