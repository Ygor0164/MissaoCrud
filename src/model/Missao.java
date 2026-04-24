package model;

import java.util.Random;

public class Missao {
    private String nome;
    private String descricao;
    private String dificuldade;
    private int recompensa;
    private String status;
    private int id;

    public Missao(String nome, String descricao, String dificuldade, String status , int recompensa) {
       this.setNome(nome);
       this.setDescricao(descricao);
       this.setDificuldade(dificuldade);
       this.setStatus(status);
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

    public String  isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dificuldade='" + dificuldade + '\'' +
                ", recompensa=" + recompensa +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
