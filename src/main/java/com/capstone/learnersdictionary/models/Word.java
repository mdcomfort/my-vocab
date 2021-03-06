package com.capstone.learnersdictionary.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private String definition;
    private String sentence;

    @ManyToMany(mappedBy = "wordListSet", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<WordList> wordList = new HashSet<>();

    public Word(String word, String definition, String sentence) {
        this.word = word;
        this.definition = definition;
        this.sentence = sentence;
    }

    public Word() {
    }

    public Word(WordDto wordDto) {
        this.word = wordDto.getWord();
        this.definition = wordDto.getDefinition();
        this.sentence = wordDto.getSentence();
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

}
