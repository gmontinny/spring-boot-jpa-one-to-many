package com.onetomany.relacionamento.controller;


import com.onetomany.relacionamento.model.Story;
import com.onetomany.relacionamento.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/story")
public class StoryController {

    @Autowired
    StoryRepository storyRepository;

    @ResponseBody
    @RequestMapping(value = "/stories")
    public List<Story> getBookDetails() {
        return  (List<Story>) storyRepository.findAll();
    }
}
