package com.ap.portfolio.services;

import com.ap.portfolio.entities.User;
import com.ap.portfolio.repositories.BaseRepository;
import com.ap.portfolio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseServiceImpl<User, Long> {
    @Autowired
    private UserRepository userRepository;

    public UserService(BaseRepository<User, Long> baseRepository) {
        super(baseRepository);
    }
}
