package com.banzak.training.service;


import com.banzak.training.model.User;
import com.banzak.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void updateUser(Long id, User user){
        user.setId(id);
        userRepository.save(user);
    }

    public void deleterUser(Long id){
        userRepository.deleteById(id);
    }
}
