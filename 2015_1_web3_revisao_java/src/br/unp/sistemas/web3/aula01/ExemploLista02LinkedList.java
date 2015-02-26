package br.unp.sistemas.web3.aula01;

import java.util.LinkedList;
import java.util.List;

public class ExemploLista02LinkedList {

    /* Exemplo usando Lista encadeada e Generics */
    public static void main(String[] args) {
        List<String> lista = new LinkedList();
        lista.add("Maca");
        lista.add("Pera");
        lista.add("Pao");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
