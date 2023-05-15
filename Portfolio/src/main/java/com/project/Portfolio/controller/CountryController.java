package com.project.Portfolio.controller;

import com.project.Portfolio.model.Country;
import com.project.Portfolio.service.ICountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    @Autowired
    private ICountryService countryServ;

    @GetMapping("/all")
    public ResponseEntity<List<Country>> getCountries() {
        List<Country> countryList = countryServ.getCountries();
        return new ResponseEntity<>(countryList, HttpStatus.OK);
    }
}
