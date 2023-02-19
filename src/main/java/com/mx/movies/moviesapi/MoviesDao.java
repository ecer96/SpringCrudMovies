/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.movies.moviesapi;

import org.springframework.data.repository.CrudRepository;
//Interfaz para poder hacer uso de los metodos , en este caso se define nuestra Entidad y el tipo de datos de nuestra llave Primaria , Podemos agregar mas metodos
//pero CrudRepository ya incluye los suficientes para un crud basico.
public interface MoviesDao extends CrudRepository<Movies,Long>{

}