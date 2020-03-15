package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.*;


@Entity
@Table(name="games")
public class Game extends Auditable {
    @ManyToMany @Getter @Setter
    private Set<Player> players = new HashSet<>();

    @Setter @Getter
    @Enumerated(EnumType.STRING)
    @NotBlank
    private GameMode gameMode;

    @Getter @Setter @NotNull
    private int numRounds=5;

    @OneToMany(mappedBy = "game",cascade = CascadeType.ALL)
    @Getter @Setter

    private List<Round> rounds = new ArrayList<>();

    @Getter @Setter
    private boolean hasAllen=false;

    @Getter @Setter @NotNull
    @ManyToOne
    private Player leader;

    @ManyToMany(cascade = CascadeType.ALL)
    private Map<Player,Stat> playerStatMap =new HashMap<>();

    @Setter @Getter @Enumerated(EnumType.STRING)
    private GameStatus gameStatus;

    @Getter @Setter @ManyToMany
    private Set<Player> readyPlayers=new HashSet<>();

}
