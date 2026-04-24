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
                System.out.println("Status: " + m.isStatus());
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
                System.out.println("Status: " + m.isStatus());
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
                System.out.println("Status: " + m.isStatus());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
                return m;
            }else {
                System.out.println("NOME inexistente.");
            }
        }
        return null; // não encontrou
    }

    public void atualizarStatus(int id, String novoStatus) {
        for (Missao m : missao) {
            if (m.getId() == id) {
                m.setStatus(novoStatus);
                System.out.println("Status atualizado com sucesso!");
                System.out.println("-----");
                System.out.println("Nome: " + m.getNome());
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("Dificuldade: " + m.getDificuldade());
                System.out.println("Status: " + m.isStatus());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
                return;
            }
        }
        System.out.println("Missão não encontrada");
    }

    public void atualizarMissao(int id , String novoNome , String novoDescricao,
                                String novoDificuldade, String novoStatus) {
        for (Missao m : missao) {
            if (m.getId() == id) {
                m.setNome(novoNome);
                m.setDescricao(novoDescricao);
                m.setDificuldade(novoDificuldade);
                m.setStatus(novoStatus);
                System.out.println("Missao atualizado com sucesso!");
                System.out.println("-----");
                System.out.println("Nome: " + m.getNome());
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("Dificuldade: " + m.getDificuldade());
                System.out.println("Status: " + m.isStatus());
                System.out.println("Recompensa: " + m.getRecompensa());
                System.out.println("ID: " + m.getId());
                return;
            }
        }
        System.out.println("Missão não encontrada");
    }

    public void deletarMissao(int id) {
        for (int i = 0; i < missao.size(); i++) {
            if (missao.get(i).getId() == id) {
                missao.remove(i);
                System.out.println("Missao deletada com sucesso!");
                return;
            }
        }
        System.out.println("ID inexistente.");
    }






    /* Melhorar as listas, quando nao encontra ou inexistente exibir uma mensagem. */
    /* Melhorar opcao de atualizar missao (UI) */





}
