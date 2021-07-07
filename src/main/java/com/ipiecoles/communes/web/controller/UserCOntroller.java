package com.ipiecoles.communes.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCOntroller {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
