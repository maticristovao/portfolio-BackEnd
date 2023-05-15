package com.project.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String position;
    private String startDate;
    private String endDate;
    private boolean current;
    private String description;
    private int User_id;
    private int EmployType_id;

    public Experience() {
    }

    public Experience(Long id, String company, String position, String startDate, String endDate, boolean current, String description, int User_id, int EmployType_id) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.current = current;
        this.description = description;
        this.User_id = User_id;
        this.EmployType_id = EmployType_id;
    }

}
