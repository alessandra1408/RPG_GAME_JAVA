package pacote01;

import java.util.Scanner;

public class RpgInicial {


    static void imprimeCaracteristicas(String[] caracteristicas) {

        System.out.println("=================");
        System.out.println("Nível: " + caracteristicas[0]);
        System.out.println("Nick: " + caracteristicas[1]);
        System.out.println("Gênero: " + caracteristicas[2]);
        System.out.println("Classe: " + caracteristicas[3]);
        System.out.println("Arma: " + caracteristicas[4]);
        System.out.println("=================\n");

    }

    static void escolhaCaracteristicas(String[] caracteristicas) {

        //transformar os sout do código neste formato
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!\t");
        System.out.println("[escolha do nível de dificuldade]\n");
        System.out.println("[1 - Fácil]\t [2 - Normal]\t [3 - Difícil]");

        Scanner level = new Scanner(System.in);
        int numeroLevel = level.nextInt();

        if (numeroLevel == 1) {
            caracteristicas[0] = "Fácil";
        } else if (numeroLevel == 2) {
            caracteristicas[0] = "Normal";
        } else if (numeroLevel == 3) {
            caracteristicas[0] = "Dificil";
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("[escolha o seu nick]\n");
        Scanner nick = new Scanner(System.in);
        caracteristicas[1] = nick.next();


        System.out.println("[escolha o seu gênero]\n");
        System.out.println("[1 - Feminino]");
        System.out.println("[2 - Masculino]");
        System.out.println("[3 - Outro]");

        Scanner genero = new Scanner(System.in);
        int numeroGenero = genero.nextInt();

        if (numeroGenero == 1) {
            caracteristicas[2] = "Feminino";
        } else if (numeroGenero == 2) {
            caracteristicas[2] = "Masculino";
        } else if (numeroGenero == 3) {
            caracteristicas[2] = "Outro";
        } else {
            System.out.println("Opção inválida");
        }
    }

    static void escolhasRoteiro(){

    }

    static void escolheClasse(String[] caracteristicas) throws InterruptedException {

        System.out.println("[Escolha uma classe de combate]\n");
        System.out.println("[1 - Arqueiro]");
        System.out.println("[2 - Combatente]");
        System.out.println("[3 - Cavaleiro]");
        Scanner classe = new Scanner(System.in);
        int numeroClasse = classe.nextInt();

        //comecar a usar case em vez de if
        if (numeroClasse == 1) {
            caracteristicas[3] = "Arqueiro";
        } else if (numeroClasse == 2) {
            caracteristicas[3] = "Combatente";
        } else if (numeroClasse == 3) {
            caracteristicas[3] = "Cavaleiro";
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("[Escolha suas armas]\n");

        if (numeroClasse == 1) {
            System.out.println("1 - [Arco e Flexa]");
            System.out.println("2 - [Lança]");
            System.out.println("3 - [Besteiro]");
            Scanner arma = new Scanner(System.in);
            int numeroArma = arma.nextInt();
            if (numeroArma == 1) {
                caracteristicas[4] = "Arco e Flexa";
            } else if (numeroArma == 2) {
                caracteristicas[4] = "Lança";
            } else if (numeroArma == 3) {
                caracteristicas[4] = "Besteiro";
            } else {
                System.out.println("Opção inválida");
            }

        } else if (numeroClasse == 2) {
            System.out.println("1 - [Espada]");
            System.out.println("2 - [Machadinho]");
            System.out.println("3 - [Punhal]");
            Scanner arma = new Scanner(System.in);
            int numeroArma = arma.nextInt();
            if (numeroArma == 1) {
                caracteristicas[4] = "Espada";
            } else if (numeroArma == 2) {
                caracteristicas[4] = "Machadinho";
            } else if (numeroArma == 3) {
                caracteristicas[4] = "Punhal";
            } else {
                System.out.println("Opção inválida");
            }
        } else if (numeroClasse == 3) {
            System.out.println("1 - [Lança]");
            System.out.println("2 - [Espada]");
            System.out.println("3 - [Mangual]");
            Scanner arma = new Scanner(System.in);
            int numeroArma = arma.nextInt();
            if (numeroArma == 1) {
                caracteristicas[4] = "Lança";
            } else if (numeroArma == 2) {
                caracteristicas[4] = "Espada";
            } else if (numeroArma == 3) {
                caracteristicas[4] = "Mangual";
            } else {
                System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Opcao invalida");
        }

        imprimeCaracteristicas(caracteristicas);
        new Thread();
        Thread.sleep(3000);

        roteiro(caracteristicas);
    }

    static void roteiro(String[] caracteristicas){

        System.out.println("""
                A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,
                e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.
                Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.
                """);

        System.out.println("""
                Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os
                inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate,
                já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre
                esse mal.
                """);

        System.out.println("""
                Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.
                [Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:
                """);

        System.out.println("1 - [VINGANÇA]");
        System.out.println("2 - [GLÓRIA]");

        Scanner motivacao = new Scanner(System.in);
        int numeroMotivacao = motivacao.nextInt();

        if (numeroMotivacao == 1) {
            caracteristicas[5] = "VINGANÇA";
            System.out.println("""
                    Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para
                    lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,
                    quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o
                    combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter
                    vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de
                    continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos
                    (e principalmente na sua)
                    """);
        } else if (numeroMotivacao == 2) {
            caracteristicas[5] = "GLÓRIA";
            System.out.println("""
                    Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços
                    abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com
                    jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e
                    comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá
                    pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você
                    sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o
                    aguarda, mas não antes da última batalha.
                    """);
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("""
                Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,
                suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está
                renovado. Você avança pelo portal.
                """);

        System.out.println("""
                A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só
                é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou
                desistir.
                """);

        System.out.println("1 - [SEGUIR]");
        System.out.println("2 - [DESISTIR]");

        Scanner rumo = new Scanner(System.in);
        int numeroRumo = rumo.nextInt();

        if (numeroRumo == 1) {
            caracteristicas[6] = "SEGUIR";
            System.out.println("""
                    você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma
                    fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.
                    """);
        } else if (numeroRumo == 2) {
            caracteristicas[6] = "DESISTIR";
            System.out.println("""
                    o medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta
                    para a noite lá fora e corre em direção à segurança.
                    """);
            //aqui eu tenho que finalizar o processo

        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("""
                Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como
                passar pela porta.
                                                
                [andando cuidadosamente, correndo, saltando]
                """);

        System.out.println("1 - [SALTANDO]");
        System.out.println("2 - [ANDANDO]");
        System.out.println("2 - [CORRENDO]");

        Scanner movimento = new Scanner(System.in);
        int numeroMovimento = movimento.nextInt();

        if (numeroMovimento == 1) {
            caracteristicas[7] = "SALTANDO";
            System.out.println("""
                    Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.
                    """);
        } else if (numeroMovimento == 2) {
            caracteristicas[7] = "ANDANDO";
            System.out.println("""
                    Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente
                    embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.
                    Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você,
                    no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém
                    uma delas te acerta na perna. [toma dano utilizando mecanismo de ataque descrito abaixo, porém o
                    rolamento de dados é só de 1-10]
                    """);

        } else if (numeroMovimento == 3) {
            caracteristicas[7] = "CORRENDO";
            System.out.println("""
                    Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou
                    em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à
                    procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de
                    você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em
                    uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou
                    correndo e conseguiu escapar desse ataque surpresa.
                    """);
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("""
                Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi
                aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua
                frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas
                reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que
                ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que
                estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.
                """);
        System.out.println("Você se dirige para a porta à direita.\n");
    }

    public static void main(String[] args) throws InterruptedException {

        String[] caracteristicas = new String[10];

        escolhaCaracteristicas(caracteristicas);
        escolheClasse(caracteristicas);
    }
}


