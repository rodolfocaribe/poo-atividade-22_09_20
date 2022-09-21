package com.example.atividade_22_09_20;

import javax.swing.*;

public class App {
    public static void simulador() {
        Elevador elevador = new Elevador(4, 12);
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                            MENU PRINCIPAL
                            1 - Entrar 1 pessoa.
                            2 - Sair 1 pessoa
                            3 - Subir 1 andar
                            4 - Descer 1 andar
                            5 - Exibir Status do Elevador
                            6 - Sair
                            DIGITE ABAIXO A OPÇÃO DESEJADA:"""
            ));
            switch (opcao) {
                case 1:
                    if (!elevador.entrar()) {
                        JOptionPane.showInputDialog(null, "Elevador Lotado!!");
                    }
                    break;
                case 2:
                    if (!elevador.sair()) {
                        JOptionPane.showInputDialog(null, "Elevador Vazio!!");
                    }
                    break;
                case 3:
                    if (!elevador.subir()) {
                        JOptionPane.showInputDialog(null, "Elevador já está no ultimo andar!!");
                    }
                    break;
                case 4:
                    if (!elevador.descer()) {
                        JOptionPane.showInputDialog(null, "Elevador Já estar no térreo!!");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, elevador.exibir());
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        } while (opcao != 6);
        System.exit(0);


    }

    public static void main(String[] args) {
        simulador();

    }
}
