package com.project.Portfolio.controller;

import com.project.Portfolio.model.Institution;
import com.project.Portfolio.service.IInstitutionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institution")
public class InstitutionController {
    
    @Autowired
    private IInstitutionService instServ;
    
    @GetMapping("/all")
    public ResponseEntity<List<Institution>> getInstitutions() {
        List<Institution> instList = instServ.getInstitutions();
        return new ResponseEntity<>(instList, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Institution> addInstitution(@RequestBody Institution inst) {
        Institution newInst = instServ.addInstitution(inst);
        return new ResponseEntity<>(newInst, HttpStatus.OK);
    }
    
    @PostMapping("/update")
    public ResponseEntity<Institution> updateInstitution(@RequestBody Institution inst) {
        Institution updatedInst = instServ.addInstitution(inst);
        return new ResponseEntity<>(updatedInst, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteInstitution(@PathVariable Long id) {
        instServ.deleteInstitution(id);
    }
}
