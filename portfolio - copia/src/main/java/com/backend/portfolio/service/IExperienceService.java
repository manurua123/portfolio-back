/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experience;
import java.util.List;

/**
 *
 * @author manu_
 */
public interface IExperienceService {

    public List<Experience> getAll();

    public void create(Experience e);

    public void delete(Long id);

    public Experience find(Long id);
}
