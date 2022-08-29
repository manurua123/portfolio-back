/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Skill;
import com.backend.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manu_
 */
@Service
public class SkillService implements ISkillService{
     @Autowired
    private SkillRepository repo;
    
    @Override
    public List<Skill> getAll() {
        return repo.findAll();
    }
    
    @Override
    public void create(Skill e) {
        repo.save(e);
    }
    
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public Skill find(Long id) {
        return repo.findById(id).orElse(null);
    }
}
