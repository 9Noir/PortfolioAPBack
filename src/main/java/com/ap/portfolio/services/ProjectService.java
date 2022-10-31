package com.ap.portfolio.services;

import com.ap.portfolio.entities.Project;
import com.ap.portfolio.repositories.BaseRepository;
import com.ap.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends BaseServiceImpl<Project, Long> {
    @Autowired
    private ProjectRepository projectRepository;

    public ProjectService(BaseRepository<Project, Long> baseRepository) {
        super(baseRepository);
    }
}
