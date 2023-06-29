package com.project.Portfolio.service;

import com.project.Portfolio.model.Institution;
import java.util.List;

public interface IInstitutionService {

    public List<Institution> getInstitutions();
    
    public Institution addInstitution(Institution inst);
    
    public Institution updateInstitution(Institution inst);
    
    public void deleteInstitution(Long id);
}
