package com.ap.portfolio.services;

import com.ap.portfolio.entities.Experience;
import com.ap.portfolio.repositories.BaseRepository;
import com.ap.portfolio.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService extends BaseServiceImpl<Experience, Long> {
    @Autowired
    private ExperienceRepository experienceRepository;

    public ExperienceService(BaseRepository<Experience, Long> baseRepository) {
        super(baseRepository);
    }
}
