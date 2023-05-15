package com.project.Portfolio.controller;

import com.project.Portfolio.model.Skill;
import com.project.Portfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill/")
public class SkillController {

    @Autowired
    private ISkillService skillServ;

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getExperiences() {
        List<Skill> skillList = skillServ.getSkills();
        return new ResponseEntity<>(skillList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> addExperience(@RequestBody Skill skill) {
        Skill newSkill = skillServ.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> updateExperience(@RequestBody Skill skill) {
        Skill updatedSkill = skillServ.updateSkill(skill);
        return new ResponseEntity<>(updatedSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMapping(@PathVariable Long id) {
        skillServ.deleteSkill(id);
    }
}
