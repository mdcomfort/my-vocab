package com.capstone.learnersdictionary.services;

import com.capstone.learnersdictionary.models.WordListDto;

import java.util.List;

public interface ListsService {
    List<WordListDto> getLists();

    List<WordListDto> getListWords(Long wordListId);

    WordListDto addList(WordListDto wordList);

    void deleteList(Long id);
}
