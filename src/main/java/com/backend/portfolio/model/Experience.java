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
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String position;
    private String company;
    private String companyLink;
    private String description;
    private Date begin;
    private Date End;

    public Experience() {
    }

    public Experience(Long id, String position, String company, String companyLink, String description, Date begin, Date End) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.companyLink = companyLink;
        this.description = description;
        this.begin = begin;
        this.End = End;
    }

}
