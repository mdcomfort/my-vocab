package com.capstone.learnersdictionary.frontEndDto;

import com.capstone.learnersdictionary.models.WordDto;

import java.util.List;

public class DisplayList {

    private String listName;
    private List<WordDto> words;

    public DisplayList() {
    }

    public DisplayList(String listName, List<WordDto> words) {
        this.listName = listName;
        this.words = words;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<WordDto> getWords() {
        return words;
    }

    public void setWords(List<WordDto> words) {
        this.words = words;
    }
}
