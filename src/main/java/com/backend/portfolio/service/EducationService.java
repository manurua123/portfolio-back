/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Education;
import com.backend.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manu_
 */
@Service
public class EducationService implements IEducationService {
    
    @Autowired
    private EducationRepository repo;
    
    @Override
    public List<Education> getAll() {
        return repo.findAll();
    }
    
    @Override
    public void create(Education e) {
        repo.save(e);
    }
    
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public Education find(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
