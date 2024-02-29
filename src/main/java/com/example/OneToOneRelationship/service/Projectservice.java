package com.example.OneToOneRelationship.service;


import com.example.OneToOneRelationship.model.Project;
import com.example.OneToOneRelationship.repository.Projectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Projectservice {
    @Autowired
    private Projectrepository repo;
    public Project addProject(Project project){
        return repo.save(project);
    }
    public Project saveProject(Project project){
        return repo.save(project);
}
}
