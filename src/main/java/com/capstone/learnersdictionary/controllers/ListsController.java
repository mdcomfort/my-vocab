package com.capstone.learnersdictionary.controllers;

import com.capstone.learnersdictionary.models.WordListDto;
import com.capstone.learnersdictionary.services.ListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/lists")
public class ListsController {

    private final ListsService listsService;

    @Autowired
    public ListsController(ListsService listsService) {
        this.listsService = listsService;
    }

    @GetMapping
    public List<WordListDto> getLists() { return listsService.getLists(); }

    @PostMapping("/add")
    public String addList(@RequestBody WordListDto wordListDto) {
        listsService.addList(wordListDto);
        return "List created.";
    }

    @DeleteMapping("{id}")
    public String deleteList(@PathVariable Long id) {
        listsService.deleteList(id);
        return "List deleted.";
    }

}
