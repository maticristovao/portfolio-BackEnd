package com.project.Portfolio.controller;

import com.project.Portfolio.model.Institution;
import com.project.Portfolio.service.IInstitutionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institution")
@CrossOrigin(origins = "http://localhost:4200")
public class InstitutionController {

    @Autowired
    private IInstitutionService instServ;

    @GetMapping("/all")
    public ResponseEntity<List<Institution>> getInstitutions() {
        List<Institution> instList = instServ.getInstitutions();
        return new ResponseEntity<>(instList, HttpStatus.OK);
    }
}
