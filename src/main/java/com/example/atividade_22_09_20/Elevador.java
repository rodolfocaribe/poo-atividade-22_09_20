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

    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int pessoasDentro;

    public Elevador(int capacidadePessoas, int totalAndares) {
        this.capacidadePessoas = capacidadePessoas;
        this.totalAndares = totalAndares;
    }

    public boolean entrar() {
        if (pessoasDentro < 4) {
            pessoasDentro++;
            return true;
        }
        return false;
    }

    public boolean sair() {
        if (pessoasDentro > 0) {
            pessoasDentro--;
            return true;
        }
        return false;
    }

    public boolean subir() {
        if (andarAtual < 12) {
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean descer() {
        if (andarAtual > 1) {
            andarAtual--;
            return true;
        }
        return false;
    }

    public String exibir() {
        return "Bem vindo ao Elevator Controller!\nEste prédio possui " + totalAndares + " andares.\nA capacidade deste elevador é de " + capacidadePessoas + " pessoas.\nNeste momento o elevador está com " + pessoasDentro + " pessoas.\nO elevador está no " + andarAtual + " andar.";
    }

}
