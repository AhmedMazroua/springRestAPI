package com.SkillSpire.restapiv1.repositories;


import com.SkillSpire.restapiv1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}