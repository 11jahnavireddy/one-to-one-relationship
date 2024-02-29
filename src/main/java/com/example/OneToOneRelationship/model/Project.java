package com.example.OneToOneRelationship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String projectname;
    public String projectdescription;
    public String projectmanager;
    public String projectstatus;
    public String projecttype;
    public String projectstartdate;
    public String projectenddate;

}
