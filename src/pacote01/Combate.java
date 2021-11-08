package pacote01;

public class Combate  extends  Personagem{

    static Personagem enemy = new Personagem();
    static Personagem jogador = new Personagem();

    public void setAtaqueJogador(){
        enemy.setVida(enemy.getVida() - (jogador.getDano() - enemy.getDefesa()));
    }

    public void setAtacaEnemy(){
        jogador.setVida(jogador.getVida() - (enemy.getDano() - jogador.getDefesa()));
    }

}
