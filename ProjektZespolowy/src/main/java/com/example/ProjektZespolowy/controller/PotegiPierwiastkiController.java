package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PotegiPierwiastkiController {
    @GetMapping("/potegiPierwiastki")
    public String potegiPierwiastki(){
        return "potegiPierwiastki";
    }
}
