package br.com.fiap.tds2ps.spring_mvc.repository;

import br.com.fiap.tds2ps.spring_mvc.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    // Aqui podem ser adicionados métodos personalizados de consulta
}
