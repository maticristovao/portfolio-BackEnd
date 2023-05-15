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
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String media;
    private String url;
    private String User_id;

    public Social() {
    }

    public Social(Long id, String media, String url, String User_id) {
        this.id = id;
        this.media = media;
        this.url = url;
        this.User_id = User_id;
    }

}
