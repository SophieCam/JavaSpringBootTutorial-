package com.tts.demo.repository;

import com.tts.demo.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Long aligns with your ID type for your entity
//the repository needs ti have its ID type defined, otherwise it will not work
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    //this method will be generated for us by spring
    //the generation will follow the name of the method
    //in order to perform the requested functionality
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);

}
