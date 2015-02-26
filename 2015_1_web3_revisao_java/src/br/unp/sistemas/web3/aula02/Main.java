package br.unp.sistemas.web3.aula02;

import br.unp.sistemas.web3.aula02.entidades.Aluno;
import br.unp.sistemas.web3.aula02.repositorios.RepositorioAlunos;
import br.unp.sistemas.web3.aula02.repositorios.RepositorioAlunosImplementacao;
import java.util.List;

/**
 * JavaBean, Getter, Setter, Repositório, Herança, Interface, Classe Abstrata
 *
 * @author jfrank
 */
public class Main {

    RepositorioAlunos repositorio = new RepositorioAlunosImplementacao();

    private void listar() {
        List<Aluno> alunos = repositorio.localizarTodos();
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
        System.out.println();
    }

    private void executar() {
        listar();
        Aluno pedro = new Aluno();
        pedro.setNome("Pedro Machado");
        repositorio.incluir(pedro);
        listar();
    }

    public static void main(String[] args) {
        (new Main()).executar();
    }
}
