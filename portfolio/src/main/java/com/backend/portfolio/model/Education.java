/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.model;

import java.util.Date;
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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String career;
    private String university;
    private String img;
    private String link;
    private String certification;
    private Date begin;
    private Integer progress;

    public Education() {
    }

    public Education(Long id, String career, String university, String img, String link, String certification, Date begin, Integer progress) {
        this.id = id;
        this.career = career;
        this.university = university;
        this.img = img;
        this.link = link;
        this.certification = certification;
        this.begin = begin;
        this.progress = progress;
    }

}
