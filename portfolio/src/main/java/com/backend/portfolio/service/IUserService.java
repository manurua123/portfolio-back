/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.User;
import java.util.List;

/**
 *
 * @author manu_
 */
public interface IUserService {

    public List<User> getAll();

    public void create(User e);

    public void delete(Long id);

    public User find(Long id);
    
    public User findUsername(String username, String pass);

}
