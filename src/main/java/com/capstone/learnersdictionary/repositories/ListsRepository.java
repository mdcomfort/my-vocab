package com.capstone.learnersdictionary.repositories;

import com.capstone.learnersdictionary.models.WordList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends JpaRepository<WordList, Long> {

}
