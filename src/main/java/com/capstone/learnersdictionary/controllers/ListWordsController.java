package com.capstone.learnersdictionary.controllers;

import com.capstone.learnersdictionary.models.WordDto;
import com.capstone.learnersdictionary.models.WordListDto;
import com.capstone.learnersdictionary.services.ListsService;
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
    public ListWordsController(ListsService listsService) {
        this.listsService = listsService;
    }

    private final ListsService listsService;

    @GetMapping("/words")
    public List<WordListDto> getListWords(@PathVariable Long id) {
        return listsService.getListWords(id);
    }
}
