package com.example.psych.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "rounds")
public class Round extends Auditable{
    @ManyToOne
    @Getter @Setter
    @NotNull
    private Game game;

    @ManyToOne
    @Getter @Setter
    @NotNull
    private Question question;

    @Getter @Setter
    @ManyToOne
    private EllenAnswer ellenAnswer;

    @ManyToMany(cascade = CascadeType.ALL)
    @Getter @Setter
    private Map<Player,PlayerAnswer> playerAnswers = new HashMap<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @Getter @Setter
    private Map<Player,PlayerAnswer> selectedAnswers = new HashMap<>();

    @Getter @Setter
    private int roundNum;
}
