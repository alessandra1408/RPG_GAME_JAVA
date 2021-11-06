package pacote01;

import java.util.Scanner;

 class RpgLuta {

    static int ataqueUsuario(){

        System.out.println("Escolha o seu ataque:\n");
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

        System.out.println("=================");
        System.out.println("Nível: " + level1);
        System.out.println("Nick: " + nick1);
        System.out.println("Gênero: " + gender1);
        System.out.println("=================");

        return 0;
    }

}
