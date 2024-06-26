import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcessionariaApp{
    private List<Pecas> pecas;
    private List<Carro> carros;
    private List<Gerente> gerentes;
    private List<Estagiario> estagiarios;

    public ConcessionariaApp() {
        pecas = new ArrayList<>();
        carros = new ArrayList<>();
        gerentes = new ArrayList<>();
        estagiarios = new ArrayList<>();
    }

    // Métodos para adicionar entidades
    public void adicionarPeca(int id, String nome, double preco) {
        Pecas peca = new Peca(id, nome, preco);
        pecas.add(peca);
        System.out.println("Peça adicionada com sucesso.");
    }

    public void adicionarCarro(int id, String marca, String modelo) {
        Carro carro = new Carro(id, marca, modelo);
        carros.add(carro);
        System.out.println("Carro adicionado com sucesso.");
    }

    public void adicionarGerente(int id, String nome, double salario, String departamento) {
        Gerente gerente = new Gerente(id, nome, salario, departamento);
        gerentes.add(gerente);
        System.out.println("Gerente adicionado com sucesso.");
    }

    public void adicionarEstagiario(int id, String nome, double salario, int horasSemanais) {
        Estagiario estagiario = new Estagiario(id, nome, salario, horasSemanais);
        estagiarios.add(estagiario);
        System.out.println("Estagiário adicionado com sucesso.");
    }

    // Métodos para remover entidades
    public void removerPeca(int id) {
        for (Peca p : pecas) {
            if (p.getId() == id) {
                pecas.remove(p);
                System.out.println("Peça removida com sucesso.");
                return;
            }
        }
        System.out.println("Peça não encontrada.");
    }

    public void removerCarro(int id) {
        for (Carro c : carros) {
            if (c.getId() == id) {
                carros.remove(c);
                System.out.println("Carro removido com sucesso.");
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public void removerGerente(int id) {
        for (Gerente g : gerentes) {
            if (g.getId() == id) {
                gerentes.remove(g);
                System.out.println("Gerente removido com sucesso.");
                return;
            }
        }
        System.out.println("Gerente não encontrado.");
    }

    public void removerEstagiario(int id) {
        for (Estagiario e : estagiarios) {
            if (e.getId() == id) {
                estagiarios.remove(e);
                System.out.println("Estagiário removido com sucesso.");
                return;
            }
        }
        System.out.println("Estagiário não encontrado.");
    }

    // Métodos para buscar entidades
    public void buscarPeca(int id) {
        for (Peca p : pecas) {
            if (p.getId() == id) {
                System.out.println("Peça encontrada:");
                System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Preço: " + p.getPreco());
                return;
            }
        }
        System.out.println("Peça não encontrada.");
    }

    public void buscarCarro(int id) {
        for (Carro c : carros) {
            if (c.getId() == id) {
                System.out.println("Carro encontrado:");
                System.out.println("ID: " + c.getId() + ", Marca: " + c.getMarca() + ", Modelo: " + c.getModelo());
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public void buscarGerente(int id) {
        for (Gerente g : gerentes) {
            if (g.getId() == id) {
                System.out.println("Gerente encontrado:");
                System.out.println("ID: " + g.getId() + ", Nome: " + g.getNome() + ", Salário: " + g.getSalario()
                        + ", Departamento: " + g.getDepartamento());
                return;
            }
        }
        System.out.println("Gerente não encontrado.");
    }

    public void buscarEstagiario(int id) {
        for (Estagiario e : estagiarios) {
            if (e.getId() == id) {
                System.out.println("Estagiário encontrado:");
                System.out.println("ID: " + e.getId() + ", Nome: " + e.getNome() + ", Salário: " + e.getSalario()
                        + ", Horas Semanais: " + e.getHorasSemanais());
                return;
            }
        }
        System.out.println("Estagiário não encontrado.");
    }

    // Método para exibir todos os funcionários
    public void exibirFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (Gerente g : gerentes) {
            g.exibirInformacoes();
        }
        for (Estagiario e : estagiarios) {
            e.exibirInformacoes();
        }
    }

    // Método para agendar revisão de carro (exemplo simples)
    public void agendarRevisao(Carro carro, String data) {
        System.out.println("Revisão do carro " + carro.getMarca() + " " + carro.getModelo() + " agendada para " + data);
    }

    // Método principal para interação com o usuário
    public static void main(String[] args) {
        ConcessionariaApp concessionaria = new ConcessionariaApp();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu da Concessionária ===");
            System.out.println("1. Adicionar Peça");
            System.out.println("2. Remover Peça");
            System.out.println("3. Buscar Peça");
            System.out.println("4. Adicionar Carro");
            System.out.println("5. Remover Carro");
            System.out.println("6. Buscar Carro");
            System.out.println("7. Adicionar Gerente");
            System.out.println("8. Remover Gerente");
            System.out.println("9. Buscar Gerente");
            System.out.println("10. Adicionar Estagiário");
            System.out.println("11. Remover Estagiário");
            System.out.println("12. Buscar Estagiário");
            System.out.println("13. Agendar Revisão de Carro");
            System.out.println("14. Exibir Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da peça: ");
                    int idPeca = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome da peça: ");
                    String nomePeca = scanner.nextLine();
                    System.out.print("Digite o preço da peça: ");
                    double precoPeca = scanner.nextDouble();
                    concessionaria.adicionarPeca(idPeca, nomePeca, precoPeca);
                    break;
                case 2:
                    System.out.print("Digite o ID da peça a ser removida: ");
                    int idRemoverPeca = scanner.nextInt();
                    concessionaria.removerPeca(idRemoverPeca);
                    break;
                case 3:
                    System.out.print("Digite o ID da peça a ser buscada: ");
                    int idBuscarPeca = scanner.nextInt();
                    concessionaria.buscarPeca(idBuscarPeca);
                    break;
                case 4:
                    System.out.print("Digite o ID do carro: ");
                    int idCarro = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a marca do carro: ");
                    String marcaCarro = scanner.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modeloCarro = scanner.nextLine();
                    concessionaria.adicionarCarro(idCarro, marcaCarro, modeloCarro);
                    break;
                case 5:
                    System.out.print("Digite o ID do carro a ser removido: ");
                    int idRemoverCarro = scanner.nextInt();
                    concessionaria.removerCarro(idRemoverCarro);
                    break;
                case 6:
                    System.out.print("Digite o ID do carro a ser buscado: ");
                    int idBuscarCarro = scanner.nextInt();
                    concessionaria.buscarCarro(idBuscarCarro);
                    break;
                case 7:
                    System.out.print("Digite o ID do gerente: ");
                    int idGerente = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = scanner.nextLine();
                    System.out.print("Digite o salário do gerente: ");
                    double salarioGerente = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o departamento do gerente: ");
                    String departamentoGerente = scanner.nextLine();
                    concessionaria.adicionarGerente(idGerente, nomeGerente, salarioGerente, departamentoGerente);
                    break;
                case 8:
                    System.out.print("Digite o ID do gerente a ser removido: ");
                    int idRemoverGerente = scanner.nextInt();
                    concessionaria.removerGerente(idRemoverGerente);
                    break;
                case 9:
                    System.out.print("Digite o ID do gerente a ser buscado: ");
                    int idBuscarGerente = scanner.nextInt();
                    concessionaria.buscarGerente(idBuscarGerente);
                    break;
                case 10:
                    System.out.print("Digite o ID do estagiário: ");
                    int idEstagiario = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do estagiário: ");
                    String nomeEstagiario = scanner.nextLine();
                    System.out.print("Digite o salário do estagiário: ");
                    double salarioEstagiario = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite as horas semanais do estagiário: ");
                    int horasSemanaisEstagiario = scanner.nextInt();
                    concessionaria.adicionarEstagiario(idEstagiario, nomeEstagiario, salarioEstagiario,
                            horasSemanaisEstagiario);
                    break;
                case 11:
                    System.out.print("Digite o ID do estagiário a ser removido: ");
                    int idRemoverEstagiario = scanner.nextInt();
                    concessionaria.removerEstagiario(idRemoverEstagiario);
                    break;
                case 12:
                    System.out.print("Digite o ID do estagiário a ser buscado: ");
                    int idBuscarEstagiario = scanner.nextInt();
                    concessionaria.buscarEstagiario(idBuscarEstagiario);
                    break;
                case 13:
                    System.out.print("Digite o ID do carro para agendar a revisão: ");
                    int idCarroRevisao = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a data da revisão (dd/mm/aaaa): ");
                    String dataRevisao = scanner.nextLine();
                    // Simulando agendamento de revisão
                    Carro carro = null;
                    for (Carro c : concessionaria.carros) {
                        if (c.getId() == idCarroRevisao) {
                            carro = c;
                            break;
                        }
                    }
                    if (carro != null) {
                        concessionaria.agendarRevisao(carro, dataRevisao);
                    } else {
                        System.out.println("Carro não encontrado para agendar revisão.");
                    }
                    break;
                case 14:
                    concessionaria.exibirFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
