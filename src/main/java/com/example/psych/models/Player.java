package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="players")
public class Player extends User implements Serializable {
    @NotBlank
    @Getter
    @Setter
    private String alais;

    @Getter
    @Setter
    private String psychFaceURL;

    @Getter
    @Setter
    private String picURL;

    @ManyToMany(mappedBy = "players")
    @Getter
    @Setter
    private Set<Game> gamesSet=new HashSet<>();


    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    private Stat stats = new Stat();

}
