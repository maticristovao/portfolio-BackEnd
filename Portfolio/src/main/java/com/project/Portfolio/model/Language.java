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
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int oral;
    @ManyToOne
    @JoinColumn(name = "oral", insertable = false, updatable = false)
    private Level oralLevel;
    private int written;
    @ManyToOne
    @JoinColumn(name = "written", insertable = false, updatable = false)
    private Level writtenLevel;
    private int User_id;

    public Language() {
    }

    public Language(Long id, String name, int oral, Level oralLevel, int written, Level writtenLevel, int User_id) {
        this.id = id;
        this.name = name;
        this.oral = oral;
        this.oralLevel = oralLevel;
        this.written = written;
        this.writtenLevel = writtenLevel;
        this.User_id = User_id;
    }

}
