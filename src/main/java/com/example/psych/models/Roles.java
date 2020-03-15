package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="roles")
public class Roles extends Auditable {
    @Getter @Setter @Column(unique = true) @NotBlank
    String name;

    @Getter @Setter @NotBlank
    String desc;
}
