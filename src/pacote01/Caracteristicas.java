package pacote01;

import java.util.Scanner;

public class Caracteristicas {

    public void main(String[] args) {

        Personagem jogador = new Personagem();
        String nome;
        String genero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\t");
        System.out.print("Qual o seu gênero?: ");
        System.out.print("Digite o seu nome: ");

        nome = entrada.nextLine();
        genero = entrada.nextLine();
        System.out.printf("\n");
        jogador.setName(nome);
        jogador.setGenero(genero);
        jogador.setVida(100);

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\t");
        System.out.println("[escolha do nível de dificuldade]\n");
        System.out.println("[1 - Fácil]\t [2 - Normal]\t [3 - Difícil]");

    }
}
