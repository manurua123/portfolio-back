/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.User;
import com.backend.portfolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manu_
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public void create(User e) {
        repo.save(e);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public User find(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User findUsername(String username, String pass) {
        if (repo.findByUsername(username).isEmpty()) {
            return null;
        } else {
            if (repo.findByUsername(username).get(0).getPassword().equals(pass)) {
                return repo.findByUsername(username).get(0);
            } else {
                return null;
            }
        }
    }

}
