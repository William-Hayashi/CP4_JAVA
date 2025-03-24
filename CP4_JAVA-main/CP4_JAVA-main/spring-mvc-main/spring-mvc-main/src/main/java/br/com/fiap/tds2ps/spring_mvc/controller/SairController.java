package br.com.fiap.tds2ps.spring_mvc.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class SairController {

    @GetMapping("/Sair")
    public String Sair() {
        return "Sair";
    }
}
