/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Post;
import java.util.List;

/**
 *
 * @author manu_
 */
public interface IPostService {
    public List<Post> getAll();

    public void create(Post e);

    public void delete(Long id);

    public Post find(Long id);
}
