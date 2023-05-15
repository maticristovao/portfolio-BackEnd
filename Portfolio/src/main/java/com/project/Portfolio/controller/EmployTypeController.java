package com.project.Portfolio.controller;

import com.project.Portfolio.model.EmployType;
import com.project.Portfolio.service.IEmployTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employ-type")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployTypeController {

    @Autowired
    private IEmployTypeService employServ;

    @GetMapping("/all")
    public ResponseEntity<List<EmployType>> getEmployTypes() {
        List<EmployType> employList = employServ.getEmployTypes();
        return new ResponseEntity<>(employList, HttpStatus.OK);
    }

}
