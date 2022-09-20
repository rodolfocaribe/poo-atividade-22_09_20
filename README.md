# ATIVIDADE EM AULA 20/09/2022

1) Faça o programa em Java que cria uma classe Elevador para conter as informações de um elevador
de prédio. A classe deve conter os atributos: andar atual (considere térreo = 0), total de andares no
prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
 Elevador( ) que deve inicializar os atributos: capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
 entrar( ) que acrescenta uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
 sair( ) que remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
 subir( ) para subir um andar (não deve subir se já estiver no último andar);
 descer( ) para descer um andar (não deve descer se já estiver no térreo);
 exibir( ) para exibir a situação do prédio em termos do uso do elevador. Veja exemplo de texto:
“Total de Andares = ??
Capacidade do Elevador = ??
Lotação do Elevador = ??
Andar atual do Elevador = ??”
 Obs.: Todos os atributos são privativos, portanto a classe deve ter todos os métodos setter e
getter.
Crie uma classe App para conter o main( ) e o método simulador( ) tal que, nesse método deve-se ter
um menu de opções para se escolher a operação a ser feita. A última opção é a SAIR.
