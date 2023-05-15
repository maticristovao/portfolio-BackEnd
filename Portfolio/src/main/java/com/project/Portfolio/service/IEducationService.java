package com.project.Portfolio.service;

import com.project.Portfolio.model.Education;
import java.util.List;

public interface IEducationService {

    public List<Education> getEducation();

    public Education addEducation(Education education);

    public Education updateEducation(Education education);

    public void deleteEducation(Long id);
}
