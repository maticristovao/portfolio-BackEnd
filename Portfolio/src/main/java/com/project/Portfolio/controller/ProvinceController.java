package com.project.Portfolio.controller;

import com.project.Portfolio.model.Province;
import com.project.Portfolio.service.IProvinceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/province")
@CrossOrigin(origins = "http://localhost:4200")
public class ProvinceController {

    @Autowired
    private IProvinceService provServ;

    @GetMapping("/all")
    public ResponseEntity<List<Province>> getProvinces() {
        List<Province> provList = provServ.getProvinces();
        return new ResponseEntity<>(provList, HttpStatus.OK);
    }
    
    @GetMapping("/country/{id}")
    public ResponseEntity<List<Province>> getProvincesByCountryId(@PathVariable Long id) {
        List<Province> provList = provServ.getProvincesByCountryId(id);
        return new ResponseEntity<>(provList, HttpStatus.OK);
    }
}
