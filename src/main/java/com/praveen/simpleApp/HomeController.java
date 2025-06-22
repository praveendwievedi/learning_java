package com.praveen.simpleApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return  "Welcome to spring learning !! ";
    }

    @RequestMapping("/about")
    public String about(){
        return  "we will now work on a good project !! ";
    }

}
