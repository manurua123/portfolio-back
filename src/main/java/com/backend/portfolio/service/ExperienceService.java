/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experience;
import com.backend.portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manu_
 */
@Service
public class ExperienceService implements IExperienceService{
     @Autowired
    private ExperienceRepository repo;
    
    @Override
    public List<Experience> getAll() {
        return repo.findAll();
    }
    
    @Override
    public void create(Experience e) {
        repo.save(e);
    }
    
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public Experience find(Long id) {
        return repo.findById(id).orElse(null);
    }
}
