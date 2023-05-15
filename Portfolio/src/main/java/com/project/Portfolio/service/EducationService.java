package com.project.Portfolio.service;

import com.project.Portfolio.model.Education;
import com.project.Portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationService implements IEducationService {

    @Autowired
    private EducationRepository educationRepo;

    @Override
    public List<Education> getEducation() {
        return educationRepo.findAllByOrderByEndDateDesc();
    }

    @Override
    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }

    @Override
    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }

}
