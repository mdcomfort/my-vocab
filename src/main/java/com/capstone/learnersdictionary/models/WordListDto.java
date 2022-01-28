package com.capstone.learnersdictionary.models;

public class WordListDto {

    private Long id;
    private String listName;

    public WordListDto(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }

    public WordListDto(WordList wordList) {
        this.id = wordList.getId();
        this.listName = wordList.getListName();
    }

    public WordListDto(String listName) {
        this.listName = listName;
    }

    public WordListDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
