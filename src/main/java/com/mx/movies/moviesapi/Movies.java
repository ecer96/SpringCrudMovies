/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.movies.moviesapi;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

//Entidad Representando mi base de datos
@Data
@Entity
@Table(name = "movies")
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    private String description;
    @Column(name="releaseyear")
    private Date releaseYear;
    private double rating;
}
