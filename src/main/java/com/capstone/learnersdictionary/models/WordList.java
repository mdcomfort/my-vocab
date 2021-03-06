package com.capstone.learnersdictionary.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lists")
public class WordList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String listName;

    @ManyToMany
    @JoinTable(
            name = "words_lists",
            uniqueConstraints = {@UniqueConstraint(columnNames = {"list_id", "word_id"})},
            joinColumns = {@JoinColumn(name = "list_id")},
            inverseJoinColumns = {@JoinColumn(name = "word_id")}
    )
    private Set<Word> wordListSet;

    public WordList() {
    }

    public WordList(String listName) {
        this.listName = listName;
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

    public Set<Word> getWordListSet() {
        return wordListSet;
    }
}
