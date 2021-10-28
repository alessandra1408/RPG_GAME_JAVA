package pacote01;

import java.util.Scanner;

public class RpgInicial {

    static Object escolhaCaracteristicas(){

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
        System.out.println("[escolha do nível de dificuldade]\n");
        System.out.println("1, 2 ou 3");
        Scanner level = new Scanner(System.in);
        int level1 = level.nextInt();

        System.out.println("[escolha o seu nick]\n");
        Scanner nick = new Scanner(System.in);
        String nick1 = nick.next();

        System.out.println("[escolha o seu gênero]\n");
        System.out.println("[Feminino]\n[Masculino]\n[Outro]\n");
        Scanner gender = new Scanner(System.in);
        String gender1 = gender.next();

        System.out.println("[Escolha uma classe de combate]\n");
        System.out.println("[1 - Arqueiro]");
        System.out.println("[2 - Combatente]");
        System.out.println("[3 - Cavaleiro]");
        Scanner classe = new Scanner(System.in);
        int classe1 = classe.nextInt();
        String classePersonagem = "";

        if (classe1 == 1){
            return classePersonagem = "Arqueiro";
        }
        else if (classe1 == 2){
            return classePersonagem = "Combatente";
        }
        else if (classe1 == 3){
            return classePersonagem = "Cavaleiro";
        }

        System.out.println("=================");
        System.out.println("Nível: " + level1);
        System.out.println("Nick: " + nick1);
        System.out.println("Gênero: " + gender1);
        System.out.println("Classe: " + classePersonagem);
        System.out.println("=================");

        return 0;
    }

    public static void main(String[] args) {
        escolhaCaracteristicas();
    }
}


