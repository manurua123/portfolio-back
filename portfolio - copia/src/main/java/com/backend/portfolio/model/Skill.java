/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author manu_
 */
@Getter
@Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String img;
    private String link;
    private String category;
    private Integer progress;

    public Skill() {
    }

    public Skill(Long id, String name, String img, String link, String category, Integer progress) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.link = link;
        this.category = category;
        this.progress = progress;
    }




   

}
