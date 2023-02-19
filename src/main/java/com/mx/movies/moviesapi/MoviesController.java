/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mx.movies.moviesapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MoviesController {
//Auto Wired permite la injeccion de datos de 

    @Autowired
    private MoviesService movieService;

//Nuestro controlador maneja las solicitudes http
    @GetMapping("/")
    public String index(Model model) {
        var movies = movieService.listMovies();
        //Estamos Trallendo de nuestra clase MoviesService La lista de Peliculas , y le asignamos el atributo movies , para usarlo en la Vista.
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/add")
    public String add(Movies movies) {
        return "edit";
    }

    @PostMapping("/save")
    public String save(Movies movies) {
        movieService.saveMovie(movies);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Movies movies, Model model) {
        movies = movieService.findMovie(movies);
        model.addAttribute("movies", movies);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(Movies movies, Model model) {
        movieService.deleteMovie(movies);
        return "redirect:/";
    }
}
