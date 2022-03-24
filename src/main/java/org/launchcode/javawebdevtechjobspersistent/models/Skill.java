package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    private String description;

    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}