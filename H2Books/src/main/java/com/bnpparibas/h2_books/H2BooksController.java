package com.bnpparibas.h2_books;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class H2BooksController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}