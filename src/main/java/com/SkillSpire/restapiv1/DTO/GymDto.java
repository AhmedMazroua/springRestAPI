package com.SkillSpire.restapiv1.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class GymDto {
    private Long id;
    private String address;
    private String managerName;
}
