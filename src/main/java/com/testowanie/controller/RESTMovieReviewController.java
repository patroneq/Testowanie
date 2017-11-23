package com.testowanie.controller;

import com.testowanie.model.Message;
import com.testowanie.model.Movie;
import com.testowanie.model.MovieReview;
import com.testowanie.model.context.MovieMovieReviewContext;
import com.testowanie.service.Implementation.MovieReviewServiceImpl;
import com.testowanie.service.Implementation.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTMovieReviewController {

    @Autowired
    private MovieReviewServiceImpl movieReviewService;

    @Autowired
    private MovieServiceImpl movieService;

    @RequestMapping(value = "/movieReview", method = RequestMethod.POST)
    public @ResponseBody Message addMovieReview(@RequestBody MovieMovieReviewContext movieMovieReviewContext) {

        MovieReview movieReview = movieMovieReviewContext.getMovieReview();

        String title = movieMovieReviewContext.getMovie().getTitle();
        Movie movie = movieService.findMovieByTitle(title);

        movieReview.setMovie(movie);

        movieReviewService.saveMovieReview(movieReview);

        return new Message(200, "Movie review has been added successfully!");
    }
}