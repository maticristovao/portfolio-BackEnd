package com.project.Portfolio.model;

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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String startDate;
    private String endDate;
    private int User_id;
    private int Area_id;
    @ManyToOne
    @JoinColumn(name = "Area_id", insertable = false, updatable = false)
    private Area area;

    private int Institution_id;
    @ManyToOne
    @JoinColumn(name = "Institution_id", insertable = false, updatable = false)
    private Institution institution;

    public Education() {
    }

    public Education(Long id, String title, String startDate, String endDate, int User_id, int Area_id, Area area, int Institution_id, Institution institution) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.User_id = User_id;
        this.Area_id = Area_id;
        this.area = area;
        this.Institution_id = Institution_id;
        this.institution = institution;
    }

}
