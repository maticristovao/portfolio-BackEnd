package com.project.Portfolio.controller;

import com.project.Portfolio.model.Social;
import com.project.Portfolio.service.ISocialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/social")
@CrossOrigin(origins = "http://localhost:4200")
public class SocialController {

    @Autowired
    private ISocialService socialServ;

    @GetMapping("/all")
    public ResponseEntity<List<Social>> getSocial() {
        List<Social> socList = socialServ.getSocial();
        return new ResponseEntity<>(socList, HttpStatus.OK);
    }
}
