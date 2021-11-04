package pacote01;

import java.util.Scanner;

public class RpgInicial {

    String[] caracteristicas;

    static void escolhaCaracteristicas(){

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
        System.out.println("[escolha do nível de dificuldade]\n");
        System.out.println("[Fácil, Normal ou Dificil]\n");
        Scanner level = new Scanner(System.in);
        String level1 = level.next();

        System.out.println("[escolha o seu nick]\n");
        Scanner nick = new Scanner(System.in);
        String nick1 = nick.next();

        System.out.println("[escolha o seu gênero]\n");
        System.out.println("[Feminino]\n[Masculino]\n[Outro]\n");
        Scanner gender = new Scanner(System.in);
        String gender1 = gender.next();

        System.out.println("[Escolha uma classe de combate]\n");
        System.out.println("[Arqueiro]");
        System.out.println("[Combatente]");
        System.out.println("[Cavaleiro]\n");
        Scanner classe = new Scanner(System.in);
        String classePersonagem = classe.next();

        Scanner arma = new Scanner(System.in);
        int numeroArma = arma.nextInt();
        String arma1 = "";

        String[] caracteristicas = {level1, nick1, gender1, classePersonagem, arma1};


        System.out.println("[Escolha suas armas]\n");

        if (classePersonagem.equals("arqueiro")){
            System.out.println("1 - [Arco e Flexa]");
            System.out.println("2 - [Lança]");
            System.out.println("3 - [Besteiro]");
            if (numeroArma == 1){
                arma1 = "Arco e Flexa";
            }
            System.out.println("Arma: " + caracteristicas[4]);
            System.out.println("=================\n");

        }
        else {
            System.out.println("Opcao invalida");
        }

        System.out.println("=================");
        System.out.println("Nível: " + caracteristicas[0]);
        System.out.println("Nick: " + caracteristicas[1]);
        System.out.println("Gênero: " + caracteristicas[2]);
        System.out.println("Classe: " + caracteristicas[3]);

    }

    public static void main(String[] args) {
        escolhaCaracteristicas();
    }
}


