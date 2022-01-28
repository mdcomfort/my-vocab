package com.capstone.learnersdictionary.models;

public class WordDto {

    private Long id;
    private String word;
    private String definition;
    private String sentence;

    public WordDto(Word word) {
        this.id = word.getId();
        this.word = word.getWord();
        this.definition = word.getDefinition();
        this.sentence = word.getSentence();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public WordDto(Long id, String word, String definition, String sentence) {
        this.id = id;
        this.word = word;
        this.definition = definition;
        this.sentence = sentence;
    }

    public WordDto() {
    }

    public WordDto(String word, String definition, String sentence) {
        this.word = word;
        this.definition = definition;
        this.sentence = sentence;
    }
}
