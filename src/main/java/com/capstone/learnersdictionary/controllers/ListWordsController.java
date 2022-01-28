package com.capstone.learnersdictionary.controllers;

import com.capstone.learnersdictionary.models.WordDto;
import com.capstone.learnersdictionary.services.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/lists/{id}")
public class ListWordsController {

    @Autowired
    public ListWordsController(WordsService wordsService) {
        this.wordsService = wordsService;
    }

    private final WordsService wordsService;

    @GetMapping("/words")
    public List<WordDto> getListWords(@PathVariable Long id) {
        return wordsService.getListWords(id);
    }
}
