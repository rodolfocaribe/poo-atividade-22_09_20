package com.example.atividade_22_09_20;

public class Elevador {
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }

    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasDentro = 0;

    public Elevador(int capacidadePessoas, int andarAtual) {
        this.capacidadePessoas = capacidadePessoas;
        this.andarAtual = andarAtual;
    }

}
