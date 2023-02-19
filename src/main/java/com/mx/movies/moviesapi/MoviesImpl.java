/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.movies.moviesapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MoviesImpl implements MoviesService {

    @Autowired
    MoviesDao moviesDao;

    @Override
    @Transactional(readOnly = true)
    public List<Movies> listMovies() {
        return (List<Movies>) moviesDao.findAll();
    }

    @Override
    @Transactional
    public void saveMovie(Movies movie) {
        moviesDao.save(movie);
    }

    @Override
    @Transactional
    public void deleteMovie(Movies movie) {
        moviesDao.delete(movie);
    }

    @Override
    @Transactional(readOnly = true)
    public Movies findMovie(Movies movie) {
        return moviesDao.findById(movie.getId()).orElse(null);
    }

}
