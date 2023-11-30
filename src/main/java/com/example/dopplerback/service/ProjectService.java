package com.example.dopplerback.service;

import com.example.dopplerback.entity.Project;
import com.example.dopplerback.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> getById(Long id) {
        return projectRepository.findById(id);
    }

    public void save(Project project){
        projectRepository.save(project);
    }

    public void delete(Long id){
        projectRepository.deleteById(id);
    }
}
