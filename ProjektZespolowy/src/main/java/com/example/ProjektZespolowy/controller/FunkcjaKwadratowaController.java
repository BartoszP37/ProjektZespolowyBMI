package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FunkcjaKwadratowaController {
    @GetMapping("/funkcjakwadratowa")
    public String funkcjaKwadratowa(){
        return "funkcjaKwadratowa";
    }

    @PostMapping("/liczfunkcjakwadratowa")
    public String liczFunkcjaKwadratowa(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c, Model model){
        int delta=(b*b)-4*a*c;
        if(delta<0){
            model.addAttribute("info", "Brak miejsc zerowych");
        }
        else if(delta==0) {
            int m = (-1 * b) / (2 * a);
            model.addAttribute("info", "Funkcja posiada jedno miejsce zerowe i jest ono równe: " + m);
        }
        else{
            double m=(-1*b-Math.sqrt(delta))/(2*a);
            double n=(-1*b+Math.sqrt(delta))/(2*a);
            model.addAttribute("info", "Funkcja posiada dwa miejsca zerowe i wynoszą one: "+ m + " " + n);
        }
        return "funkcjaKwadratowa";
    }


}
