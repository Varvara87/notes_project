package com.itstep;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.itstep.model.Note;
@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
//List<Note> findByTitleContainingOrMessageContaining(String word1, String word2);
@Query("Select n from Note n where n.title like :word or n.message like :word or n.create_date like :word or n.last_change_date like :word")
List <Note> search(@Param("word")String word);
//@Query("update Note n set n.title=title, n.message=message where n.id=id")
//void update(@Param("note")Note note);



}
