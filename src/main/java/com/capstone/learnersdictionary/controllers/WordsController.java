package com.capstone.learnersdictionary.controllers;

import com.capstone.learnersdictionary.models.WordDto;
import com.capstone.learnersdictionary.services.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/words")
public class WordsController {

    private final WordsService wordsService;

    @Autowired
    public WordsController(WordsService wordsService) {
        this.wordsService = wordsService;
    }

    @GetMapping
    public List<WordDto> getWords() {
        return wordsService.getWords();
    }

    @PostMapping("/add")
    public String addWord(@RequestBody WordDto wordDto) {
        wordsService.addWord(wordDto);
        return "Entry added.";
    }

    @DeleteMapping("{id}")
    public String deleteWord(@PathVariable Long id) {
        wordsService.deleteWord(id);
        return "Entry deleted.";
    }
}
