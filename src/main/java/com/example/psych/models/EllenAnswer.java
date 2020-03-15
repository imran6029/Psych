package com.example.psych.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ellenanswers")
public class EllenAnswer extends Auditable {

     @NotNull
    @Getter @Setter
    private Question mapquestion;

    @Getter @Setter
    private long votes=0L;

    @Getter @Setter @NotBlank
    private String answer;
}
