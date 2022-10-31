package com.ap.portfolio.services;

import com.ap.portfolio.entities.Skill;
import com.ap.portfolio.repositories.BaseRepository;
import com.ap.portfolio.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService extends BaseServiceImpl<Skill, Long> {
    @Autowired
    private SkillRepository skillRepository;

    public SkillService(BaseRepository<Skill, Long> baseRepository) {
        super(baseRepository);
    }
}
