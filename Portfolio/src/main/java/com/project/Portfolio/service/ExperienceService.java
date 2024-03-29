package com.project.Portfolio.service;

import com.project.Portfolio.model.Experience;
import com.project.Portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService implements IExperienceService {
    
    @Autowired
    private ExperienceRepository expRepo;
    
    @Override
    public List<Experience> getExperiences() {
        return expRepo.findAllByOrderByEndDateDesc();
    }
    
    @Override
    public Experience addExperience(Experience exper) {
        return expRepo.save(exper);
    }
    
    @Override
    public Experience updateExperience(Experience exper) {
        return expRepo.save(exper);
    }
    
    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }
    
}
