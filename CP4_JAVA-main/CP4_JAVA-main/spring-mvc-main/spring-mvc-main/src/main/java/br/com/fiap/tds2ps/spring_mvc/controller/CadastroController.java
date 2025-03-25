package br.com.fiap.tds2ps.spring_mvc.controller;

import br.com.fiap.tds2ps.spring_mvc.model.Cadastro;
import br.com.fiap.tds2ps.spring_mvc.service.CadastroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    private final CadastroService cadastroService;

    // Construtor para injetar o serviço
    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @GetMapping("/list")
    public String listCadastro(Model model) {
        model.addAttribute("listCadastro", cadastroService.getallCadastro());
        return "cadastrarLista";  // Nome da view
    }

    // Rota para mostrar o formulário de cadastro
    @GetMapping("/Novo")
    public String showCadastroForm(Model model) {
        model.addAttribute("cadastro", new Cadastro());
        return "new_cadastro";
    }

    // Rota para salvar o cadastro
    @PostMapping("/save")
    public String saveCadastro(@ModelAttribute Cadastro cadastro) {
        cadastroService.save(cadastro);
        return "redirect:/cadastro/list";  // Redireciona para a lista de cadastros após salvar
    }

    // Rota para visualizar o cadastro para edição
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Cadastro cadastro = cadastroService.findById(id);
        model.addAttribute("cadastro", cadastro);
        return "edit_cadastro";  // Nome da view para o formulário de edição
    }

    // Rota para atualizar o cadastro
    @PostMapping("/update/{id}")
    public String updateCadastro(@PathVariable Long id, @ModelAttribute Cadastro cadastro) {
        cadastro.setId(id);  // Garante que o ID seja mantido ao atualizar
        cadastroService.save(cadastro);
        return "redirect:/cadastro/list";  // Redireciona para a lista de cadastros após atualizar
    }

    // Rota para deletar o cadastro
    @GetMapping("/delete/{id}")
    public String deleteCadastro(@PathVariable Long id) {
        cadastroService.delete(id);
        return "redirect:/cadastro/list";  // Redireciona para a lista de cadastros após deletar
    }
}
