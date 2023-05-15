package com.project.Portfolio.service;

import com.project.Portfolio.model.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperiences();

    public Experience addExperience(Experience exper);

    public Experience updateExperience(Experience exper);

    public void deleteExperience(Long id);
}
