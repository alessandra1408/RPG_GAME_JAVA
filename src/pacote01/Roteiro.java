package pacote01;

import java.util.Scanner;
import java.util.Random;

public class Roteiro {

    public static void imprimeCaracteristicas(Personagem jogador) {


        //cada elemento do caracteristicas vai receber os get.
        //o print vai ser de um loop conforme o tamanho do array.
        //posso usar dois loops, um para inserir e outro para ler.
        //vou precisar de uma outra funcao.

        System.out.println("\n" +
                "===================================\n" +
                "Vida: " + jogador.getVida() + "\n" +
                "Dano: " + jogador.getDano() + "\n" +
                "Defesa: " + jogador.getDefesa() + "\n" +
                //"Dificuldade: " + jogador.getDificuldade() + "\n" +
                //"Nome: " + jogador.getName() + "\n" +
                //"Gênero: " + jogador.getGenero() + "\n" +
                //"Classe: " + jogador.getClasse() + "\n" +
                //"Arma: " + jogador.getArma() + "\n" +
                "==================================");
    }

    public static void imprimeCaracteristicasEnemy(Inimigo enemy) {


        //cada elemento do caracteristicas vai receber os get.
        //o print vai ser de um loop conforme o tamanho do array.
        //posso usar dois loops, um para inserir e outro para ler.
        //vou precisar de uma outra funcao.

        System.out.println("\n" +
                "===================================\n" +
                "Inimigo\n" +
                "Vida: " + enemy.getVida() + "\n" +
                "Dano: " + enemy.getDano() + "\n" +
                "Defesa: " + enemy.getDefesa() + "\n" +
                "==================================");
    }

    public static void imprimeMotivacao(Escolhas escolha){
        System.out.println("\n" +
                "Motivacao: " + escolha.getMotivacao() + "\n");
    }

    public static void defineCaracteristicas(Personagem jogador) throws InterruptedException {

        String nome;
        String genero = " ";
        String dificuldade = " ";
        String classe = " ";
        String arma = " ";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\t");

        jogador.setVida(100);
        jogador.setDano(20);
        jogador.setDefesa(30);

        pausa(1);
        System.out.print("Qual o seu gênero?: \n");

        while(genero.charAt(0) != 'f' && genero.charAt(0) != 'm' && genero.charAt(0) != 'o'){
            System.out.println("'f' para [Feminino]");
            System.out.println("'m' para [Masculino]");
            System.out.println("'o' para [Outro]");
            genero = entrada.nextLine();
        }
        if(genero.charAt(0) == 'f'){
            jogador.setGenero("Feminino");
        }
        else if(genero.charAt(0) == 'm'){
            jogador.setGenero("Masculino");
        }
        else if(genero.charAt(0) == 'o'){
            jogador.setGenero("Outro");
        }

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        jogador.setName(nome);

        System.out.println("[escolha do nível de dificuldade]\n");

        while(dificuldade.charAt(0) != 'f' && dificuldade.charAt(0) != 'n' && dificuldade.charAt(0) != 'd'){
            System.out.println("'f' para [Fácil]");
            System.out.println("'n' para [Normal]");
            System.out.println("'d' para [Difícil]");
            dificuldade = entrada.nextLine();
        }
        if(dificuldade.charAt(0) == 'f'){
            jogador.setDificuldade("Fácil");
        }
        else if(dificuldade.charAt(0) == 'm'){
            jogador.setDificuldade("Normal");
        }
        else if(dificuldade.charAt(0) == 'o'){
            jogador.setDificuldade("Difícil");
        }

        System.out.println("[Escolha uma classe de combate]\n");

        while(classe.charAt(0) != 'a' && classe.charAt(0) != 'c' && classe.charAt(0) != 'v'){
            System.out.println("'a' para Arqueiro");
            System.out.println("'c' para Combatente");
            System.out.println("'v' para Cavaleiro");
            classe = entrada.nextLine();
        }
        if(classe.charAt(0) == 'a'){
            jogador.setClasse("arqueiro");
        }
        else if(classe.charAt(0) == 'c'){
            jogador.setClasse("combatente");
        }
        else if(classe.charAt(0) == 'v'){
            jogador.setClasse("cavaleiro");
        }

        System.out.println("[Escolha suas armas]\n");

        switch (jogador.getClasse()) {
            case "arqueiro" -> {

                while(arma.charAt(0) != 'a' && arma.charAt(0) != 'l' && arma.charAt(0) != 'b'){
                    System.out.println("'a' para Arco e Flexa");
                    System.out.println("'l' para Lança");
                    System.out.println("'b' para Besteiro");
                    arma = entrada.nextLine();
                }
                if(arma.charAt(0) == 'a'){
                    jogador.setArma("Arco e Flexa");
                }
                else if(arma.charAt(0) == 'l'){
                    jogador.setArma("Lança");
                }
                else if(arma.charAt(0) == 'b'){
                    jogador.setArma("Besteiro");
                }
            }
            case "combatente" -> {

                while(arma.charAt(0) != 'e' && arma.charAt(0) != 'm' && arma.charAt(0) != 'p'){
                    System.out.println("'e' para [Espada]");
                    System.out.println("'m' para [Machadinho]");
                    System.out.println("'p' para [Punhal]");
                    arma = entrada.nextLine();
                }
                if(arma.charAt(0) == 'e'){
                    jogador.setArma("Espada");
                }
                else if(arma.charAt(0) == 'm'){
                    jogador.setArma("Machadinho");
                }
                else if(arma.charAt(0) == 'p'){
                    jogador.setArma("Punhal");
                }
            }
            case "cavaleiro" -> {

                while(arma.charAt(0) != 'l' && arma.charAt(0) != 'm' && arma.charAt(0) != 'g'){
                    System.out.println("'l' para [Lança]");
                    System.out.println("'m' para [Espada]");
                    System.out.println("'g' para [Mangual]");
                    arma = entrada.nextLine();
                }
                if(arma.charAt(0) == 'l'){
                    jogador.setArma("Lança");
                }
                else if(arma.charAt(0) == 'e'){
                    jogador.setArma("Espada");
                }
                else if(arma.charAt(0) == 'g'){
                    jogador.setArma("Mangual");
                }
            }
        }
    }

    public static int giraDados(int valor, int tempo) throws InterruptedException{
        Random gerador = new Random();

        System.out.println("Jogando os dados");
        pausaDramatica(tempo);
        int dados = gerador.nextInt(valor) + 1;

        System.out.println("Você tomou um dano de " + dados + " pontos de vida");

        return dados;
    }

    public static int dados(int valor, int tempo) throws InterruptedException{
        Random gerador = new Random();

        return gerador.nextInt(valor) + 1;
    }

    public static boolean paraOuContinua(Escolhas escolha){

        while(true){
            switch (escolha.getContinuar()) {
                case "seguir" -> {

                    System.out.println("""
                    você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma
                    fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.
                    """);
                    return true;
                }
                case "desistir" -> {

                    System.out.println("""
                    o medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta
                    para a noite lá fora e corre em direção à segurança.
                    """);

                    return false;
                }
                default -> {
                    System.out.println("Opção Inválida");
                }
            }
        }

    }

    private static void gameover() {
        System.out.println("Fulano voce está morto!") ;
        System.out.println("GAME OVER!");
        System.exit(0); //terminates if lost
    }

    private static boolean attack(Personagem jogador,Inimigo enemy) throws InterruptedException {

        System.out.println("Você Atacou!\n");

        int vidaEnemy = enemy.getVida() - (jogador.getDano() + dados(20, 0));
        enemy.setVida(vidaEnemy);
        if(enemy.getVida() != 0){
            System.out.println("O inimigo tomou um dano de " + (jogador.getDano() + dados(20, 0)) + " pontos de vida.\n Agora possui " + enemy.getVida()+ " de Vida");
        }

        if(vidaEnemy <= 0){
            System.out.println(" !!! Você Ganhou !!!");
            return false;
        } else{
            System.out.println("Vez do Inimigo\n");
        }
        return true;
    }

    private static void enemyattack(Personagem jogador, Inimigo enemy) throws InterruptedException {

        System.out.println("O inimigo Atacou!\n");

        int vidaJogador = jogador.getVida() - (enemy.getDano() + dados(20, 0));
        jogador.setVida(vidaJogador);

        if (jogador.getVida() != 0){
            System.out.println("Você tomou um dano de " + (enemy.getDano() + dados(20, 0)) + " pontos de vida.\n Agora possui " + jogador.getVida()+ " de Vida");
        }

        if(vidaJogador <= 0){
            gameover();
            System.exit(0);//game over if player health < 0
        } else{
            System.out.println("Sua vez!\n");
        }
    }

    private static void fight(Scanner entrada, Personagem jogador, Inimigo enemy) throws InterruptedException {
        String action;
        System.out.println("O inimigo se aproximou");
        boolean fighting = true;
        while(fighting){
            System.out.println("'a' para ATACAR\n'f' FUGIR");
            action = entrada.nextLine();
            if(action.charAt(0) == 'a'){
                fighting = attack(jogador, enemy);
                enemyattack(jogador, enemy);
            }
            if(action.charAt(0) == 'f'){
                imprimeCaracteristicas(jogador);
                imprimeCaracteristicasEnemy(enemy);
                System.out.println("Você fugiu");
                fighting = false;
            }
        }
    }

    public static void pausa(int valor) throws InterruptedException {
        valor = valor * 1000;
        Thread.sleep(valor);
    }

    public static void pausaDramatica(int valor) throws InterruptedException {
        valor = valor * 1000;
        Thread.sleep((valor));
        System.out.println("...");
        Thread.sleep(valor);
    }

    public static void roteiro(Personagem jogador, Inimigo enemy, Escolhas escolha, Combate combate) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);

        String motivacao = " ";
        String continuar = " ";
        String movimento = " ";

//        System.out.println("""
//                A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,
//                e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.
//                Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.
//                """);
//
//        System.out.println("""
//                Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os
//                inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate,
//                já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre
//                esse mal.
//                """);
//
//        System.out.println("""
//                Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.
//                [Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:
//                """);
//
//
//        while(motivacao.charAt(0) != 'v' && motivacao.charAt(0) != 'g'){
//            System.out.println("'v' para [Vingança]");
//            System.out.println("'g' para [Glória]");
//            motivacao = entrada.nextLine();
//        }
//        if(motivacao.charAt(0) == 'v'){
//            escolha.setMotivacao("Vingança");
//        }
//        else if(motivacao.charAt(0) == 'g'){
//            escolha.setMotivacao("Glória");
//        }
//
//        switch (escolha.getMotivacao()) {
//            case "Vingança" -> {
//
//                System.out.println("""
//                        Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para
//                        lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,
//                        quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o
//                        combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter
//                        vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de
//                        continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos
//                        (e principalmente na sua)
//                        """);
//            }
//            case "Glória" -> {
//
//                System.out.println("""
//                        Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços
//                        abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com
//                        jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e
//                        comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá
//                        pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você
//                        sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o
//                        aguarda, mas não antes da última batalha.
//                        """);
//            }
//        }
//
//        System.out.println("""
//                Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,
//                suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está
//                renovado. Você avança pelo portal.
//                """);
//
//        System.out.println("""
//                A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só
//                é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou
//                desistir.
//                """);
//
//
//        while(continuar.charAt(0) != 's' && continuar.charAt(0) != 'd'){
//            System.out.println("'s' para [SEGUIR]");
//            System.out.println("'d' para [DESISTIR]");
//            continuar = entrada.nextLine();
//        }
//        if(continuar.charAt(0) == 's'){
//            escolha.setContinuar("seguir");
//        }
//        else if(continuar.charAt(0) == 'd'){
//            escolha.setContinuar("desistir");
//        }
//
//        //se der tempo, tenho que transformar esses while e if em uma funcao padrao
//
//        if (paraOuContinua(escolha)){
//            System.out.println("""
//                Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como
//                passar pela porta.
//
//                [andando cuidadosamente, correndo, saltando]
//                """);
//
//            while(movimento.charAt(0) != 's' && movimento.charAt(0) != 'a' && movimento.charAt(0) != 'c'){
//                System.out.println("'s' para [SALTANDO]");
//                System.out.println("'a' para [ANDANDO]");
//                System.out.println("'c' para [CORRENDO]");
//
//                movimento = entrada.nextLine();
//            }
//            if(movimento.charAt(0) == 's'){
//                escolha.setMovimento("Saltando");
//            }
//            else if(movimento.charAt(0) == 'a'){
//                escolha.setMovimento("Andando");
//            }
//            else if(movimento.charAt(0) == 'c'){
//                escolha.setMovimento("Correndo");
//            }
//
//            switch (escolha.getMovimento()) {
//                case "Saltando" -> {
//
//                    System.out.println("""
//                    Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.
//                    """);
//                }
//                case "Andando" -> {
//
//                    System.out.println("""
//                    Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente
//                    embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.
//                    Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você,
//                    no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém
//                    uma delas te acerta na perna.
//                    """);
//                    System.out.println("""
//                    [toma dano utilizando mecanismo de ataque descrito abaixo, porém o
//                    rolamento de dados é só de 1-10]""");
//
//                    pausaDramatica(2);
//                    jogador.setVida(giraDados(10));
//
//                }
//                case "Correndo" -> {
//
//                    System.out.println("""
//                    Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou
//                    em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à
//                    procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de
//                    você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em
//                    uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou
//                    correndo e conseguiu escapar desse ataque surpresa.
//                    """);
//                }
//                default -> {
//                    System.out.println("Opção Inválida");
//                }
//            }
//
//            System.out.println("""
//                Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi
//                aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua
//                frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas
//                reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que
//                ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que
//                estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.
//                """);
//            System.out.println("Você se dirige para a porta à direita.\n");
//
//            System.out.println("""
//                Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com
//                mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara
//                com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em
//                armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos
//                que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.
//                """);
//
//            System.out.println("""
//                No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo,
//                de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.
//                """);

            //Aqui devo entrar em modo combate
        //}

        System.out.println("\n!!! Em combate !!!\n");

        fight(entrada, jogador, enemy);

    }

    public static void main(String[] args) throws InterruptedException {
        Personagem jogador = new Personagem();
        Escolhas escolha = new Escolhas();
        Combate combate = new Combate();
        Inimigo enemy = new Inimigo();
        Scanner entrada = new Scanner(System.in);

        //defineCaracteristicas(jogador);
        //imprimeCaracteristicas(jogador);
        //pausaDramatica(3);

        jogador.setVida(100);
        jogador.setDano(30);
        jogador.setDefesa(30);

        enemy.setVida(50);
        enemy.setDano(10);
        enemy.setDefesa(10);
        //roteiro(jogador, enemy, escolha, combate);

        fight(entrada, jogador, enemy);

    }
}