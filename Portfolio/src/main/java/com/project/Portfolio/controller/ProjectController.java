package com.project.Portfolio.controller;

import com.project.Portfolio.model.Project;
import com.project.Portfolio.service.IProjectService;
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
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private IProjectService projServ;

    @GetMapping("/all")
    public ResponseEntity<List<Project>> getProjects() {
        List<Project> projList = projServ.getProjects();
        return new ResponseEntity<>(projList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Project> addProject(@RequestBody Project proj) {
        Project newProj = projServ.addProject(proj);
        return new ResponseEntity<>(newProj, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Project> updateProject(@RequestBody Project proj) {
        Project updatedProj = projServ.updateProject(proj);
        return new ResponseEntity<>(updatedProj, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id) {
        projServ.deleteProject(id);
    }
}
