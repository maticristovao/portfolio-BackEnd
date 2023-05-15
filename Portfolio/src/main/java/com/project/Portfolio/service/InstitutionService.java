package com.project.Portfolio.service;

import com.project.Portfolio.model.Institution;
import com.project.Portfolio.repository.InstitutionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService implements IInstitutionService {

    @Autowired
    private InstitutionRepository instRepo;

    @Override
    public List<Institution> getInstitutions() {
        return instRepo.findAll();
    }

}
