package com.SkillSpire.restapiv1.models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_fname")
    private String firstName;
    @Column(name = "user_lname")
    private String lastName;
    @Column(name = "user_address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private Gym gym;
}