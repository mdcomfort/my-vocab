package com.capstone.learnersdictionary.services;

import com.capstone.learnersdictionary.models.WordDto;

import java.util.List;

public interface WordsService {
    List<WordDto> getWords();

//    List<WordDto> getListWords(Long wordListId);

    WordDto addWord(WordDto word);

    void deleteWord(Long id);
}
