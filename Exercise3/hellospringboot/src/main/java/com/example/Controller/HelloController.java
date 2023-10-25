package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String greet(){
       return "Hello Welcome to Spring Learning" ;
    }

}
