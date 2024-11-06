package com.SkillSpire.restapiv1.repositories;

import com.SkillSpire.restapiv1.models.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {
}
