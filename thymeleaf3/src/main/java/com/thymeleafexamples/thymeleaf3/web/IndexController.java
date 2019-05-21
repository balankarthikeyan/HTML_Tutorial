package com.thymeleafexamples.thymeleaf3.web;

import java.util.Arrays;

import com.thymeleafexamples.thymeleaf3.model.Wordings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        // Wordings item = new Wordings();
        // item.setTitle("Hello");
        // item.setDescription("Sample Data");

        // model.addAttribute("data", item);
        model.addAttribute("items", Arrays.asList(new Wordings("Title1", "desc1"), new Wordings("Title2", "desc2")));
        return "admin.html";
    }
}
