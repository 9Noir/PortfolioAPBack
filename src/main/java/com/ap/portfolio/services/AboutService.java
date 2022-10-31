package com.ap.portfolio.services;

import com.ap.portfolio.entities.About;
import com.ap.portfolio.repositories.AboutRepository;
import com.ap.portfolio.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService extends BaseServiceImpl<About, Long> {
    @Autowired
    private AboutRepository aboutRepository;

    public AboutService(BaseRepository<About, Long> baseRepository) {
        super(baseRepository);
    }
}
