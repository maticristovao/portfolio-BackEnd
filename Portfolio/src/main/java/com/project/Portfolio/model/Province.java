package com.project.Portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    @JoinColumn(name = "Country_id", insertable = false, updatable = false)
    private Country country;

    public Province() {
    }

    public Province(Long id, String name, int Country_id, Country country) {
        this.id = id;
        this.name = name;
        this.Country_id = Country_id;
        this.country = country;
    }

}
