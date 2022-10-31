package com.ap.portfolio.services;

import com.ap.portfolio.entities.Education;
import com.ap.portfolio.repositories.BaseRepository;
import com.ap.portfolio.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService extends BaseServiceImpl<Education, Long> {
    @Autowired
    private EducationRepository educationRepository;

    public EducationService(BaseRepository<Education, Long> baseRepository) {
        super(baseRepository);
    }
}
