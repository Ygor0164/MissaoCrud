package service;

import model.Missao;

import java.util.ArrayList;
import java.util.List;

public class MissaoService {
        private List<Missao> missao = new ArrayList<>();

        public void adicionarMissao(Missao missao) {
            this.missao.add(missao);
        }


        public  void listarMissoes() {
            if (missao.isEmpty()) {
                System.out.println("Nenhuma missão cadastrada.");
                return;
            }

            for (Missao m : missao) {
                System.out.println("-----");
                System.out.println("Nome: " + m.getNome());
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("Dificuldade: " + m.getDificuldade());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
            }



    }

    public Missao buscarPorId(int id) {
        for (Missao m : missao) {
            if (m.getId() == id) {
                System.out.println("-----");
                System.out.println("Nome: " + m.getNome());
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("Dificuldade: " + m.getDificuldade());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
                return m;
            }else {
                System.out.println("ID inexistente.");
            }
        }
        return null; // não encontrou
    }
    public Missao buscarPorName(String name) {
        for (Missao m : missao) {
            if (m.getNome().equals(name)) {
                System.out.println("-----");
                System.out.println("Nome: " + m.getNome());
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("Dificuldade: " + m.getDificuldade());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
                return m;
            }else {
                System.out.println("NOME inexistente.");
            }
        }
        return null; // não encontrou
    }

    /* Melhorar as listas, quando nao encontra ou inexistente exibir uma mensagem. */




}
