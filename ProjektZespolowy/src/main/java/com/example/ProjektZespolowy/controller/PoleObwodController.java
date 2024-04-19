package com.example.ProjektZespolowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PoleObwodController {
    @GetMapping("/poleObwod")
    public String poleObwod() {
        return "poleObwod";
    }

    @PostMapping("/kwadrat")
    public String kwadrat(@RequestParam("boka") int boka, Model model) {
        int pole=boka*boka;
        int obwod=boka*4;
        model.addAttribute("info", "Pole podanego kwadratu wynosi " + pole + " a jego obwód jest równy " + obwod);
        return "poleObwod";
    }

    @PostMapping("/prostokąt")
    public String prostokąt(@RequestParam("boka") int boka, @RequestParam("bokb") int bokb, Model model) {
        int pole=boka*bokb;
        int obwod=(boka*2)+(bokb*2);
        model.addAttribute("info", "Pole podanego prostokąta wynosi " + pole + " a jego obwód jest równy " + obwod);
        return "poleObwod";

    }

    @PostMapping("/trapez")
    public String trapez(@RequestParam("boka") int boka, @RequestParam("bokb") int bokb, @RequestParam("wysokosc") int wysokosc, Model model) {
        int pole=((boka+bokb)*wysokosc)/2;
        int x=(bokb-boka)/2;
        double c=Math.sqrt((x*x)+(wysokosc*wysokosc));
        double obwod= (c+c+boka+bokb);
        model.addAttribute("info", "Pole podanego trapezu wynosi " + pole + " a jego obwód jest równy " + obwod);
        return "poleObwod";
    }
    @PostMapping("/kolo")
    public String kolo(@RequestParam("promien") int promien, Model model) {
        double pole=Math.PI*promien*promien;
        double obwod=2*Math.PI*promien;
        model.addAttribute("info", "Pole podanego koła wynosi " + pole + " a jego obwód jest równy " + obwod);
        return "poleObwod";

    }
}
