package com.project.Portfolio.model;

import jakarta.persistence.Column;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String surname;
    private String title;
    private String email;
    private String phone;
    private String about;
    private String photo;
    private String username;
    private String password;
    private int Province_id;
    @ManyToOne
    @JoinColumn(name = "Province_id", insertable = false, updatable = false)
    private Province province;

    public User() {
    }

    public User(Long id, String name, String surname, String title, String email, String phone, String about, String photo, String username, String password, int Province_id, Province province) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.about = about;
        this.photo = photo;
        this.username = username;
        this.password = password;
        this.Province_id = Province_id;
        this.province = province;
    }

}
