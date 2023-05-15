package com.project.Portfolio.service;

import com.project.Portfolio.model.Country;
import com.project.Portfolio.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository countryRepo;

    @Override
    public List<Country> getCountries() {
        return countryRepo.findAllByOrderByName();
    }

}
