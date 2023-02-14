package com.bnpparibas.h2_books.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    @ModelAttribute("book")
    public List<Book> listAll() {
        return bookRepo.findAll();
    }
}