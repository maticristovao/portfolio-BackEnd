package com.project.Portfolio.service;

import com.project.Portfolio.model.Project;
import com.project.Portfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService implements IProjectService {

    @Autowired
    private ProjectRepository projRepo;

    @Override
    public List<Project> getProjects() {
        return projRepo.findAll();
    }

    @Override
    public Project addProject(Project proj) {
        return projRepo.save(proj);
    }

    @Override
    public Project updateProject(Project proj) {
        return projRepo.save(proj);
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }

}
