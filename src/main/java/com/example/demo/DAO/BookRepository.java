package com.example.demo.DAO;

import com.example.demo.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
    // we can define methods here like find by title or find by author
}
