package br.unp.sistemas.web3.aula02.repositorios;

import br.unp.sistemas.web3.aula02.entidades.Aluno;
import java.util.LinkedList;
import java.util.List;

public class RepositorioAlunosImplementacao implements RepositorioAlunos {

    private final List<Aluno> alunos = new LinkedList();

    @Override
    public List<Aluno> localizarTodos() {
        return alunos;
    }

    @Override
    public void incluir(Aluno aluno) {
        alunos.add(aluno);
    }

    public void iniciar() {
        Aluno paulo = new Aluno();
        paulo.setMatricula("222222");
        paulo.setNome("Paulo Mendonca");
        paulo.setEndereco("Rua Y, 200");
        paulo.setTelefone("(00)5555-7777");
        paulo.setCpf("222.333.444-55");
        paulo.setAnoIngresso(2015);
        incluir(paulo);

        Aluno antonio = new Aluno();
        antonio.setMatricula("111111");
        antonio.setNome("Antonio Garcia");
        antonio.setEndereco("Rua X, 100");
        antonio.setTelefone("(00)2345-6789");
        antonio.setCpf("111.222.333-44");
        antonio.setAnoIngresso(2015);
        incluir(antonio);
    }

    public RepositorioAlunosImplementacao() {
        iniciar();
    }
}
