package com.SkillSpire.restapiv1.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class GymDto {
    private int id;
    private String address;
    private String managerName;
    private List<UserDto> users;
}
