package com.testowanie.controller;

import com.testowanie.model.Episode;
import com.testowanie.model.Message;
import com.testowanie.service.Implementation.EpisodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTEpisodeController {

    @Autowired
    private EpisodeServiceImpl episodeService;

    @RequestMapping(value = "/episode/{id}")
    public Episode findEpisodeById(@PathVariable("id") Long id) {
        return episodeService.findEpisodeById(id);
    }

    @RequestMapping(value = "/episode/{id}", method = RequestMethod.PATCH)
    public @ResponseBody Message updateEpisode(@PathVariable("id") Long id, @RequestBody Episode episode) {
        Episode doesExist = episodeService.findEpisodeById(id);
        if (doesExist == null) {
            return new Message (404, "Episode does not exist!");
        } else {
            episode.setId(id);
            episodeService.saveEpisode(episode);
            return new Message(200, "Episode was updated successfully!");
        }
    }


    @RequestMapping(value = "/episode", method = RequestMethod.POST)
    public @ResponseBody Message addEpisode(@RequestBody Episode episode) {
        Episode episodeExists = episodeService.findEpisodeByTitle(episode.getTitle());
        if (episodeExists == null) {
            episodeService.saveEpisode(episode);
            return new Message(200, "Episode has been added successfully!");
        } else {
            return new Message(405, "This episode already exists");
        }
    }
}
