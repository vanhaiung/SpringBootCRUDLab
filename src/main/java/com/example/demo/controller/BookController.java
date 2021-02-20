package com.example.demo.controller;

import com.example.demo.Entity.Book;
import com.example.demo.servie.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

//    @GetMapping
//    public String getBooks() {
//        return "Hello World";
//    }

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
