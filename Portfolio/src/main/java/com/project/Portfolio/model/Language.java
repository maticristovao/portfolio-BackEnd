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
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int oral;
    private int written;
    private int User_id;

    public Language() {
    }

    public Language(Long id, String name, int oral, int written, int User_id) {
        this.id = id;
        this.name = name;
        this.oral = oral;
        this.written = written;
        this.User_id = User_id;
    }

}
