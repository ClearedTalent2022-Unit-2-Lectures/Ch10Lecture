package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping
    @ResponseBody
    public String index() {
        return "<h1>This is the student page of our app.</h1>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<h1>Student form</h1>" +
                "<br>" +
                "<form method='POST' action='/student/results' >" +
                "<input type='text' name='firstName' />" +
                "<input type='text' name='lastName' />" +
                "<button>Submit</button>" +
                "</form>";
    }

    @PostMapping("results")
    @ResponseBody
    public String handleFormSubmit(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
