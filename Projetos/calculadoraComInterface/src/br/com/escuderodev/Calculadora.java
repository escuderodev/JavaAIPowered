package br.com.escuderodev;

public class Calculadora implements OperacaoMatematica{

    @Override
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
