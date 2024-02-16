package br.com.escuderodev.primeiros_passos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    private Calculadora calculadora;

    public MyApp(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.somar(1,2));
    }
}
