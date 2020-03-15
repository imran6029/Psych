package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employee extends User {

    @Getter
    @Setter
    @NotNull
    private String address;


    @Getter @Setter @NotNull
    private String phoneNumber;



    @Getter @Setter @NotNull
    private String name;
}


