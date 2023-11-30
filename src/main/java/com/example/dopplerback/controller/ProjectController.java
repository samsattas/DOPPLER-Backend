package com.example.dopplerback.controller;

import com.example.dopplerback.entity.Project;
import com.example.dopplerback.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAll(){
        return projectService.getAll();
    }

    @GetMapping("/{projectId}")
    public Optional<Project> getById(@PathVariable("projectId") Long projectId ){
        return projectService.getById(projectId);
    }

    @PostMapping
    public void post(@RequestBody Project project){
        projectService.save(project);
    }

    @DeleteMapping("/{projectId}")
    public void delete(@PathVariable("projectId") Long projectId){
        projectService.delete(projectId);
    }
}
