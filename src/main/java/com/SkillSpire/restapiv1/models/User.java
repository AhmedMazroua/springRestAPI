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
    @Column(name="user_fname")
    private String firstName;
    @Column(name="user_lname")
    private String lastName;
    @Column(name="user_address")
    private String address;

    public User(String firstName, String lastName, String address) {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
