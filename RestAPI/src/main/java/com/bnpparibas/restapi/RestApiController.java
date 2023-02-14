package com.bnpparibas.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestApiController {

    @Autowired
    private RestApiProps props;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("version", props.getVersion());
        model.addAttribute("name", props.getName());
        model.addAttribute("description", props.getDescription());
        model.addAttribute("url", props.getUrl());
        return "index";
    }
}