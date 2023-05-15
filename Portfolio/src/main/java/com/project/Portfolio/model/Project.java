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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String repo;
    private String description;
    private String link;
    private String collection;
    private String image;
    private int User_id;

    public Project() {
    }

    public Project(Long id, String title, String repo, String description, String link, String collection, String image, int User_id) {
        this.id = id;
        this.title = title;
        this.repo = repo;
        this.description = description;
        this.link = link;
        this.collection = collection;
        this.image = image;
        this.User_id = User_id;
    }

}
