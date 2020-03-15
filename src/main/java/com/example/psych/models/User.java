package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User extends Auditable {
    @NotBlank
    @Email
    @Column(unique = true)
    @Getter
    @Setter
    private String email;

    @NotBlank
    @Getter
    @Setter
    private String hashedPassword;

    @ManyToMany
    @Getter
    @Setter
    Set<Roles> roles = new HashSet<>();
}
