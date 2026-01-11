package com.mykael.Notes.controllers.web;

import com.mykael.Notes.exceptions.NotaNotFoundException;
import com.mykael.Notes.models.Nota;
import com.mykael.Notes.services.NotaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/notas")
public class NotaWebController {

    private final NotaService notaService;

    public NotaWebController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public String paginaListarNotas(Model model) {
        model.addAttribute("notas",notaService.listar());
        return "notas";
    }

    @GetMapping("/nova")
    public String paginaNovaNota(Model model) {
        model.addAttribute("nota", new Nota());
        return "nova-nota";
    }

    @PostMapping
    public String criar(@Valid @ModelAttribute("nota") Nota nota, BindingResult bindingResult, RedirectAttributes ra) {
        if (bindingResult.hasErrors()) {
            return "nova-nota";
        }
        notaService.salvar(nota);
        ra.addFlashAttribute("sucesso", "Anotação salva!");
        return "redirect:/notas";
    }

    @PostMapping("/{id}/deletar")
    public String excluir(@PathVariable Long id, RedirectAttributes ra) {
        try {
            notaService.deletar(id);
            ra.addFlashAttribute("sucesso", "Anotação deletada com sucesso!");
        } catch (NotaNotFoundException e) {
            ra.addFlashAttribute("erro", "Erro ao deletar nota  " + e.getMessage());
        }
        return "redirect:/notas";
    }

}
