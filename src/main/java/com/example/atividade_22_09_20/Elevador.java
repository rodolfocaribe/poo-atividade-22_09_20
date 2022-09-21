package com.example.atividade_22_09_20;

import javax.swing.JOptionPane;

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
    private int totalAndares = 12;
    private int capacidadePessoas = 4;
    private int pessoasDentro = 0;

    public Elevador(int capacidadePessoas, int andarAtual) {
        this.capacidadePessoas = capacidadePessoas;
        this.andarAtual = andarAtual;
    }

    public boolean entrar() {
        if (capacidadePessoas < 4) {
            capacidadePessoas++;
            return true;
        }
        return false;
    }

    public boolean sair() {
        if (capacidadePessoas > 0) {
            capacidadePessoas--;
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

    public void exibir() {
        JOptionPane.showMessageDialog(null, "Bem vindo ao Elevator Controller!\nEste prédio possui " + totalAndares + " andares.\nA capacidade deste elevador é de " + capacidadePessoas + " pessoas.\nNeste momento o elevador está com " + pessoasDentro + " pessoas.\nO elevador está no " + andarAtual + " andar.");
    }

}
