/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Skill;
import java.util.List;

/**
 *
 * @author manu_
 */
public interface ISkillService {
    public List<Skill> getAll();

    public void create(Skill e);

    public void delete(Long id);

    public Skill find(Long id);
}
