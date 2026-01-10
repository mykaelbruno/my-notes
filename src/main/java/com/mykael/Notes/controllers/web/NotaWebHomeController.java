package com.mykael.Notes.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NotaWebHomeController {

    @GetMapping("/") // home
    public String home(RedirectAttributes ra) {

        ra.addFlashAttribute("info", "Olá, Seja bem vindoao meu projeto pessoal! Desenvolvi esse sistema de anotações para aperfeiçoar minhas habilidades em desenvolvimento web com Srping boot + Thymeleaf, espero que goste, faça bom uso! :)");
        return "redirect:/notas";

    }
}
