package model;

import service.MissaoService;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    MissaoService service = new MissaoService();
    int opcao = -1;

    public void Menu(){

        do {

            System.out.println("1 - Criar Missão\n" +
                    "2 - Listar Missões\n" +
                    "3 - Atualizar Missão\n" +
                    "4 - Deletar Missão\n" +
                    "0 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: { /* CRIAR MISSAO */
                    System.out.println("=== Criar Missão ===");

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Dificuldade (F/M/D): ");
                    String dificuldade = sc.nextLine();

                    System.out.print("Status: ");
                    String status = sc.nextLine();

                    System.out.print("Recompensa (Quantidade de XP): ");
                    int recompensa = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    Missao missao = new Missao(nome, descricao, dificuldade,  status , recompensa);

                    service.adicionarMissao(missao);

                    System.out.println("Missão criada com sucesso!");
                    System.out.println("[ID: " + missao.getId() + "]");
                } break;

                case 2: {/* LISTAR MISSAO*/
                    int opcao2 = -1;

                    do {
                        System.out.println("1 - Todas\n" +
                                "2 - Por ID\n" +
                                "3 - Buscar por nome");

                        opcao2 = sc.nextInt();
                        switch (opcao2) {
                            case 1: { /* LISTA GERAL*/
                                service.listarMissoes();
                            } break;
                            case 2: { /* LISTA POR ID*/
                                System.out.println("ID: ");
                                service.buscarPorId(sc.nextInt());

                            }  break;
                            case 3: { /* LISTA POR NOME*/
                                System.out.println("Nome: ");
                                service.buscarPorName(sc.next());

                            }  break;
                            default: {
                                System.out.println("Opcao invalida!");
                            }
                        }
                    }while (opcao2 != 0);


                } break;

                case 3: { /* ATUALIZAR MISSAO */
                    int id;
                    int opcao3 = -1;
                    service.listarMissoes();
                    System.out.println("--------------");
                    System.out.print("ID Missao: ");
                    id = sc.nextInt();

                    service.buscarPorId(id);
                    if (service != null){
                        do {
                            System.out.println("1 - Alterar status\n" +
                                    "2 - Editar dados\n" +
                                    "0 - Sair");
                            opcao3 = sc.nextInt();
                            switch (opcao3) {
                                case 1: {/* Alterar status */
                                    service.atualizarStatus(id , sc.next());
                                }  break;
                                case 2: {/* Editar dados */
                                    service.atualizarMissao(id , sc.next() , sc.next() , sc.next() , sc.next());
                                }   break;
                                case 0: break;
                                default: {
                                    System.out.println("Opcao invalida!");
                                }
                            }
                        }while (opcao3 != 0);
                    }


                } break;

                case 4: {

                } break;

                case 0: {

                } break;

                default: {
                    System.out.println("Opcao invalida! ");
                } break;
            }

        } while (opcao != 0);

    }

}
