package com.project.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int progress;
    private int User_id;

    public Skill() {
    }

    public Skill(Long id, String name, int progress, int User_id) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.User_id = User_id;
    }

}
