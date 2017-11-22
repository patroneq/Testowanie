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
