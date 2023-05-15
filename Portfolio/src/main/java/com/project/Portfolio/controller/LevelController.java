package com.project.Portfolio.controller;

import com.project.Portfolio.model.Level;
import com.project.Portfolio.service.ILevelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/level")
public class LevelController {

    @Autowired
    private ILevelService levServ;

    @GetMapping("/all")
    public ResponseEntity<List<Level>> getLevels() {
        List<Level> levList = levServ.getLevels();
        return new ResponseEntity<>(levList, HttpStatus.OK);
    }
}
