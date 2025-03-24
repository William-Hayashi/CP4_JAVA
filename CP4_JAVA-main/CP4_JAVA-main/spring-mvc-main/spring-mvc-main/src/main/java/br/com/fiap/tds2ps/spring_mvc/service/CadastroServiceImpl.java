package br.com.fiap.tds2ps.spring_mvc.service;

import br.com.fiap.tds2ps.spring_mvc.model.Cadastro;
import br.com.fiap.tds2ps.spring_mvc.repository.CadastroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroServiceImpl implements CadastroService {

    private final CadastroRepository cadastroRepository;

    // Construtor para injetar o repositório
    public CadastroServiceImpl(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    // Método para buscar todos os cadastros
    @Override
    public List<Cadastro> getallCadastro() {
        return cadastroRepository.findAll();
    }

    // Método para buscar um cadastro pelo ID
    @Override
    public Cadastro findById(Long id) {
        Optional<Cadastro> cadastro = cadastroRepository.findById(id);
        return cadastro.orElse(null); // Retorna o cadastro ou null se não encontrado
    }

    // Método para salvar um cadastro (incluir ou atualizar)
    @Override
    public void save(Cadastro cadastro) {
        cadastroRepository.save(cadastro);  // O save do JpaRepository é utilizado para salvar ou atualizar
    }

    // Método para excluir um cadastro
    @Override
    public void delete(Long id) {
        cadastroRepository.deleteById(id);  // Exclui o cadastro pelo ID
    }
}
