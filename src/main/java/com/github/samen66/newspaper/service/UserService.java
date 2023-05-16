package com.github.samen66.newspaper.service;

import com.github.samen66.newspaper.model.User;
import com.github.samen66.newspaper.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repositoryIml;
    @Autowired
    public UserService(UserRepository repositoryIml) {
        this.repositoryIml = repositoryIml;
    }

    public List<User> getAll(){
        return repositoryIml.findAll();
    }
    public User getUserById(int id){
        return repositoryIml.getUserById(id);
    }
}
