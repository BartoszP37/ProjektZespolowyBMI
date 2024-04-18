package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PoleObwodController {
    @GetMapping("/poleObwod")
    public String poleObwod(){
        return "poleObwod";
    }
}
