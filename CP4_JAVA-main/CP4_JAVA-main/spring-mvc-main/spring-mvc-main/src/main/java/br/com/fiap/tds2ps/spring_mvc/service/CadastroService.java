package br.com.fiap.tds2ps.spring_mvc.service;

import br.com.fiap.tds2ps.spring_mvc.model.Cadastro;

import java.util.List;

public interface CadastroService {

    List<Cadastro> getallCadastro();

    Cadastro findById(Long id);

    void save(Cadastro cadastro);

    void delete(Long id);
}
