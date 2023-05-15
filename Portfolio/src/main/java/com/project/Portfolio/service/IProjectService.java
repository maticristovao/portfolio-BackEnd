package com.project.Portfolio.service;

import com.project.Portfolio.model.Project;
import java.util.List;

public interface IProjectService {

    public List<Project> getProjects();

    public Project addProject(Project proj);

    public Project updateProject(Project proj);

    public void deleteProject(Long id);
}
