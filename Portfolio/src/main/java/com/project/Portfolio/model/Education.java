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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String startDate;
    private String endDate;
    private int User_id;
    private int Area_id;
    private int Institution_id;

    public Education() {
    }

    public Education(Long id, String title, String startDate, String endDate, int User_id, int Area_id, int Institution_id) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.User_id = User_id;
        this.Area_id = Area_id;
        this.Institution_id = Institution_id;
    }

}
