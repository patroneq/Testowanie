package com.testowanie.controller;

import com.testowanie.model.Message;
import com.testowanie.model.Movie;
import com.testowanie.service.Implementation.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTMovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @RequestMapping(value = "/movie/{id}")
    public Movie findMovieById(@PathVariable("id") Long id) {
        return movieService.findMovieById(id);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.PATCH)
    public @ResponseBody Message updateMovie(@PathVariable("id") Long id, @RequestBody Movie movie) {
        Movie doesExist = movieService.findMovieById(id);
        if (doesExist == null) {
            return new Message (404, "Movie does not exist!");
        } else {
            movie.setId(id);
            movieService.saveMovie(movie);
            return new Message(200, "Movie was updated successfully!");
        }
    }


    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public @ResponseBody Message addMovie(@RequestBody Movie movie) {
        Movie movieExists = movieService.findMovieByTitle(movie.getTitle());
        if (movieExists == null) {
            movieService.saveMovie(movie);
            return new Message(200, "Movie has been added successfully!");
        } else {
            return new Message(405, "This movie already exists");
        }
    }
}
