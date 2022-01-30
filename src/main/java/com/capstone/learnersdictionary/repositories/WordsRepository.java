package com.capstone.learnersdictionary.repositories;

import com.capstone.learnersdictionary.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordsRepository extends JpaRepository<Word, Long> {

}
