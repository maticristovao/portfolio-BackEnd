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
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int Country_id;

    public Province() {
    }

    public Province(Long id, String name, int Country_id) {
        this.id = id;
        this.name = name;
        this.Country_id = Country_id;
    }

}
