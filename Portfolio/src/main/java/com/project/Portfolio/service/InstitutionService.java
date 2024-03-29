package com.project.Portfolio.service;

import com.project.Portfolio.model.Institution;
import com.project.Portfolio.repository.InstitutionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InstitutionService implements IInstitutionService {

    @Autowired
    private InstitutionRepository instRepo;

    @Override
    public List<Institution> getInstitutions() {
        return instRepo.findAllByOrderByName();
    }

    @Override
    public Institution addInstitution(Institution inst) {
        return instRepo.save(inst);
    }

    @Override
    public Institution updateInstitution(Institution inst) {
        return instRepo.save(inst);
    }

    @Override
    public void deleteInstitution(Long id) {
        instRepo.deleteById(id);
    }

}
