package br.unp.sistemas.web3.aula02.repositorios;

import br.unp.sistemas.web3.aula02.entidades.Aluno;
import java.util.List;

public interface RepositorioAlunos {

    List<Aluno> localizarTodos();

    void incluir(Aluno aluno);

}
