package com.capstone.learnersdictionary.services;

import com.capstone.learnersdictionary.models.Word;
import com.capstone.learnersdictionary.models.WordDto;
import com.capstone.learnersdictionary.repositories.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Do not use an entity if you're not taking an action on a repository.

@Service
public class WordsServiceImpl implements WordsService {

    @Autowired
    public WordsServiceImpl(WordsRepository wordsRepository) {
        this.wordsRepository = wordsRepository;
    }

    private final WordsRepository wordsRepository;

    @Override
    public List<WordDto> getWords() {
        // Take the list of words and map them to the WordDto and collect them into a list.
        return wordsRepository.findAll().stream().map(WordDto::new).collect(Collectors.toList());
    }

    @Override
    public List<WordDto> getListWords(Long wordListId) {
        return wordsRepository.findAllByWordListSetId(wordListId).stream().map(WordDto::new).collect(Collectors.toList());
    }

    @Override
    public WordDto addWord(WordDto wordDto) {
        Word word = new Word();
        word.setWord(wordDto.getWord());
        word.setDefinition(wordDto.getDefinition());
        word.setSentence(wordDto.getSentence());
        word.getWordListSet().add(?);
        return new WordDto(wordsRepository.save(word));
    }

    @Override
    public void deleteWord(Long id) {
        wordsRepository.deleteById(id);
    }
}
