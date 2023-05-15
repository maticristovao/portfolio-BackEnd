package com.project.Portfolio.service;

import com.project.Portfolio.model.Province;
import com.project.Portfolio.repository.ProvinceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceService implements IProvinceService {

    @Autowired
    private ProvinceRepository provRepo;

    @Override
    public List<Province> getProvinces() {
        return provRepo.findAll();
    }

    @Override
    public List<Province> getProvincesByCountryId(Long id) {
        return provRepo.findByCountry_IdOrderByName(id);
    }

}
