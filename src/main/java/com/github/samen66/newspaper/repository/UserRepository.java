package com.github.samen66.newspaper.repository;

import com.github.samen66.newspaper.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, Integer> {
    List<User> findAll();
    User getUserById(int id);
}
