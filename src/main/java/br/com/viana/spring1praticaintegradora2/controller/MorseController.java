package br.com.viana.spring1praticaintegradora2.controller;

import br.com.viana.spring1praticaintegradora2.service.MorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/morse")
public class MorseController {

    @Autowired
    private MorseService morseService;

    @GetMapping("/traduzir/{valor}")
    public String getMorseToPortuguese(@PathVariable String valor){
        return this.morseService.getMorseToPortuguese(valor);
    }
}
