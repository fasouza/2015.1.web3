package br.unp.sistemas.web3.aula01;

public class ExemploVetor {

    public static void main(String[] args) {
        String lista[] = new String[3];
        lista[0] = "Pera";
        lista[1] = "Maca";
        lista[2] = "Pao";

        /* Acesso aos elementos do vetor pelo indice */
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        /* Reescrito para for each... */
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
