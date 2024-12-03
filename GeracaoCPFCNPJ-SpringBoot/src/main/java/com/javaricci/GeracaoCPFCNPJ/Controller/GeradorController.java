package com.javaricci.GeracaoCPFCNPJ.Controller;

import com.javaricci.GeracaoCPFCNPJ.Service.GeradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeradorController {

    @Autowired
    private GeradorService geradorService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/gerarCPF")
    public String gerarCPF(Model model) {
        model.addAttribute("documento", geradorService.gerarCPF());
        return "index";
    }

    @GetMapping("/gerarCNPJ")
    public String gerarCNPJ(Model model) {
        model.addAttribute("documento", geradorService.gerarCNPJ());
        return "index";
    }
}
