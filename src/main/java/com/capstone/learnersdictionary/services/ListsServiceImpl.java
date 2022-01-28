package com.capstone.learnersdictionary.services;

import com.capstone.learnersdictionary.models.WordList;
import com.capstone.learnersdictionary.models.WordListDto;
import com.capstone.learnersdictionary.repositories.ListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListsServiceImpl implements ListsService {

    @Autowired
    public ListsServiceImpl(ListsRepository listsRepository) {
        this.listsRepository = listsRepository;
    }

    private final ListsRepository listsRepository;

    @Override
    public List<WordListDto> getLists() {
        return listsRepository.findAll().stream().map(WordListDto::new).collect(Collectors.toList());
    }

    @Override
    public WordListDto addList(WordListDto wordListDto) {
        WordList wordList = new WordList();
        wordList.setListName(wordListDto.getListName());
        return new WordListDto(listsRepository.save(wordList));
    }

    @Override
    public void deleteList(Long id) {
        listsRepository.deleteById(id);
    }
}
