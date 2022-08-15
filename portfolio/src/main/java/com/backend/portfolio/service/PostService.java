/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Post;
import com.backend.portfolio.repository.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manu_
 */
@Service
public class PostService implements IPostService {

    @Autowired
    private PostRepository repo;

    @Override
    public List<Post> getAll() {
        return repo.findAll();
    }

    @Override
    public void create(Post e) {
        repo.save(e);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Post find(Long id) {
        return repo.findById(id).orElse(null);
    }
}
