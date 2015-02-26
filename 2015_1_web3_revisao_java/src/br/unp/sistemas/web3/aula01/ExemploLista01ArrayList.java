package br.unp.sistemas.web3.aula01;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista01ArrayList {

    /* Exemplo usando Lista implementada com vetores e Generics */
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Maca");
        lista.add("Pera");
        lista.add("Pao");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
