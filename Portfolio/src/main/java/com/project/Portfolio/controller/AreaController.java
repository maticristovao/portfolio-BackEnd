package com.project.Portfolio.controller;

import com.project.Portfolio.model.Area;
import com.project.Portfolio.service.IAreaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")
@CrossOrigin(origins = "http://localhost:4200")
public class AreaController {

    @Autowired
    private IAreaService areaServ;

    @GetMapping("/all")
    public ResponseEntity<List<Area>> getAreas() {
        List<Area> areaList = areaServ.getAreas();
        return new ResponseEntity<>(areaList, HttpStatus.OK);
    }
}
