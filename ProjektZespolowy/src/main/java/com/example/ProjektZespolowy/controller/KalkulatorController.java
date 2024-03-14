package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class KalkulatorController {
    @GetMapping("/kalkulator")
        public String kalkulator(){
        return "kalkulator";
        }

}
