package br.com.fiap.tds2ps.spring_mvc.controller;

import br.com.fiap.tds2ps.spring_mvc.model.Cadastro;
import br.com.fiap.tds2ps.spring_mvc.service.CadastroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/patient")
public class PatientController {

    private final CadastroService cadastroService;

    public PatientController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @PostMapping("/save")
    public ModelAndView addPatient() {
        return new ModelAndView("add-consultation");
    }

}
