package com.ap.portfolio.repositories;

import com.ap.portfolio.entities.User;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
