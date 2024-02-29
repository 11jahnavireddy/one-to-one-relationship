package com.example.OneToOneRelationship.repository;

import com.example.OneToOneRelationship.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projectrepository extends JpaRepository<Project,Long>{
        }
