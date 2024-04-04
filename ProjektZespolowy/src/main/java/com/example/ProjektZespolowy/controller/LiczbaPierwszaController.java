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
    public String pierwsza(@RequestParam("liczba") int liczba, Model model) {
        boolean pierwsza = true;

        if (liczba <= 1) {
            pierwsza = false;
        } else {
            for (int i = 2; i <= liczba / 2; i++) {
                if (liczba % i == 0) {
                    pierwsza = false;
                    break;
                }
            }
        }

        if (pierwsza) {
            model.addAttribute("info", liczba + " jest liczbą pierwszą.");
        } else {
            model.addAttribute("info", liczba + " nie jest liczbą pierwszą.");
        }

        return "liczbaPierwsza";
    }

}
