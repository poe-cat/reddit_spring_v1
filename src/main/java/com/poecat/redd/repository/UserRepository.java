package com.poecat.redd.repository;

import com.poecat.redd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String name);
}

