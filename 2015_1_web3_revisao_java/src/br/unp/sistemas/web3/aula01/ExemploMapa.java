package br.unp.sistemas.web3.aula01;

import java.util.HashMap;
import java.util.Map;

public class ExemploMapa {

    public static void main(String args[]) {
        Map<String, String> registro = new HashMap();
        registro.put("usuario", "root");
        registro.put("senha", "1234");
        /* algum tempo depois */
        System.out.println(registro.get("usuario"));
    }
}
