package br.com.fiap.tds2ps.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intermediary")
public class IntermediaryController {
    @GetMapping
    public String showIntermediaryPage() {
        return "intermediary";
    }
}

