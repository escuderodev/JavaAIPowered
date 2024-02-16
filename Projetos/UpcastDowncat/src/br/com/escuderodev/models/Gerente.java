package br.com.escuderodev.models;

import java.math.BigDecimal;

public class Gerente extends Funcionario{
    public Gerente(String nome, Integer idade, BigDecimal salario) {
        super(nome, idade, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerenciando o time...");
    }
}
