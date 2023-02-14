package com.bnpparibas.h2_books.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book_list")
    public String totalList(Model model) {
        List<Book> books = bookService.listAll();
        model.addAttribute("books", books);
        return "book_list";
    }
}