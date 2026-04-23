package model;

import java.util.Random;

public class Missao {
    private String nome;
    private String descricao;
    private String dificuldade;
    private int recompensa;
    private int id;

    public Missao(String nome, String descricao, String dificuldade, int recompensa) {
       this.setNome(nome);
       this.setDescricao(descricao);
       this.setDificuldade(dificuldade);
       this.setRecompensa(recompensa);
        Random random = new Random();
        this.setId(random.nextInt(90) + 10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Missao{" +
                "nome='" + this.getNome() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", dificuldade='" + this.getDificuldade() + '\'' +
                ", recompensa=" + this.getRecompensa() +
                '}';
    }
}
