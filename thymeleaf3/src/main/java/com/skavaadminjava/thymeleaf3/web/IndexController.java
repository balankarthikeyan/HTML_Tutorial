package com.skavaadminjava.thymeleaf3.web;

import java.util.Arrays;

import com.skavaadminjava.thymeleaf3.model.Wordings;

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

        model.addAttribute("items", Arrays.asList(new Wordings("languagetitle", "language"),
                new Wordings("businessphoto",
                        "https://admin.skavacommerce.com/admin/studio/customlib/img/loginBanner.jpg"),
                new Wordings("businessphotoalt", "Business related photo"), new Wordings("admintitle", "Sign In"),
                new Wordings("useremaillabel", "Your Email"), new Wordings("userpasswordlabel", "Your Password"),
                new Wordings("loginSavelabel", "Keep me logged in"), new Wordings("submitlabel", "submit"),
                new Wordings("forgotpasswordlabel", "Forgot Password?"),
                new Wordings("footerdescription", "Learn more about Skava Commerce and upcoming events at Skava.com"),
                new Wordings("footerprivacylabel", "Privacy Policy"),
                new Wordings("footercopy", "© 2019 Skava. All rights reserved.")));
        model.addAttribute("language", Arrays.asList("English", "Canada"));

        return "admin.html";
    }
}
