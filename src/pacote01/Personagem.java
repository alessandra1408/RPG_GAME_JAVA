package pacote01;

public class Personagem {

    public int vida;
    public int dano;
    public int defesa;
    public String nome;
    public String genero;
    public String dificuldade;
    public String classe;
    public String arma;


    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return this.vida;
    }

    public int getDano() {
        return this.dano;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public String getName() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDificuldade() {
        return this.dificuldade;
    }

    public String getClasse() {
        return this.classe;
    }

    public String getArma() {
        return this.arma;
    }

}