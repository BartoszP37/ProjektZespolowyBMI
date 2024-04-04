package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LiczbaPierwszaController {
    @GetMapping("/liczbaPierwsza")
        public String pierwsza(){
        return "liczbaPierwsza";
        }
    @PostMapping("/pierwsza")
    public String pierwsza(@RequestParam("liczba") int liczba, Model model){
        boolean pierwsza=true;
        while (pierwsza){
            for(int i=0; i>=liczba/2; i++){
                if(liczba%i==0){
                    pierwsza=false;
                    model.addAttribute("info",liczba + " nie jest liczbą pierwszą.");
                }
            }
        }
        model.addAttribute("info",liczba + " jest liczbą pierwszą.");


        return "liczbaPierwsza";
    }

}
