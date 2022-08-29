/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Education;
import java.util.List;

/**
 *
 * @author manu_
 */
public interface IEducationService {

    public List<Education> getAll();

    public void create(Education e);

    public void delete(Long id);

    public Education find(Long id);

}
