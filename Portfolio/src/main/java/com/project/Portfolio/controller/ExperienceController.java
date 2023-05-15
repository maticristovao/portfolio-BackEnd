package com.project.Portfolio.controller;

import com.project.Portfolio.model.Experience;
import com.project.Portfolio.service.IExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {

    @Autowired
    private IExperienceService expServ;

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperiences() {
        List<Experience> expList = expServ.getExperiences();
        return new ResponseEntity<>(expList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience exper) {
        Experience newExp = expServ.addExperience(exper);
        return new ResponseEntity<>(newExp, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience exper) {
        Experience updatedExp = expServ.updateExperience(exper);
        return new ResponseEntity<>(updatedExp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMapping(@PathVariable Long id) {
        expServ.deleteExperience(id);
    }
}
