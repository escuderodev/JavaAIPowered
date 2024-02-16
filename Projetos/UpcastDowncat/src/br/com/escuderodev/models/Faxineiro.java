package br.com.escuderodev.models;

import java.math.BigDecimal;

public class Faxineiro extends Funcionario{

    public Faxineiro(String nome, Integer idade, BigDecimal salario) {
        super(nome, idade, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Limpando as dependências da empresa...");
    }
}
