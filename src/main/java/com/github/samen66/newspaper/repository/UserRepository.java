package com.github.samen66.newspaper.repository;

import com.github.samen66.newspaper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    User getUserById(int id);
}
