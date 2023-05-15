package com.project.Portfolio.controller;

import com.project.Portfolio.model.Education;
import com.project.Portfolio.service.IEducationService;
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
@RequestMapping("/education")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {

    @Autowired
    private IEducationService eduService;

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getEducation() {
        List<Education> eduList = eduService.getEducation();
        return new ResponseEntity<>(eduList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education) {
        Education newEdu = eduService.addEducation(education);
        return new ResponseEntity<>(newEdu, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        Education updatedEdu = eduService.updateEducation(education);
        return new ResponseEntity<>(updatedEdu, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEducation(@PathVariable Long id) {
        eduService.deleteEducation(id);
    }
}
