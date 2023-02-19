/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.movies.moviesapi;

import java.util.List;

public interface MoviesService {
    public List<Movies> listMovies();
    
    public void saveMovie(Movies movie);
    
    public void deleteMovie(Movies movie);
    
    public Movies findMovie(Movies movie);
}
