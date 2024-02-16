package br.com.escuderodev.models;

import java.math.BigDecimal;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, Integer idade, BigDecimal salario) {
        super(nome, idade, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Vendendo produtos...");
    }
}
