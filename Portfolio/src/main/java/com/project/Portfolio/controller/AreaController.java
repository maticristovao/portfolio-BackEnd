package com.project.Portfolio.controller;

import com.project.Portfolio.model.Area;
import com.project.Portfolio.service.IAreaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {

    @Autowired
    private IAreaService areaServ;

    @GetMapping("/areas")
    public ResponseEntity<List<Area>> getAreas() {
        List<Area> areaList = areaServ.getAreas();
        return new ResponseEntity<>(areaList, HttpStatus.OK);
    }
}
