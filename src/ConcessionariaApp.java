import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ConcessionariaApp {
    private Estoque<Peca> estoquePecas;
    private Estoque<Carro> estoqueCarros;
    private List<Clientes> clientes;
    private List<Funcionarios> funcionarios;
    private List<Carro> carros;

    public ConcessionariaApp() {
        this.estoquePecas = new Estoque<>();
        this.estoqueCarros = new Estoque<>();
        this.carros = new ArrayList<>();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();

        carregarClientesDoArquivo();
        carregarCarrosDoArquivo();
        carregarFuncionariosDoArquivo();
        carregarPecasDoArquivo();
    }

    private void criarArquivoSeNecessario(String caminhoArquivo) throws IOException {
        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs(); // Cria os diretórios necessários
            arquivo.createNewFile(); // Cria o arquivo
        }
    }

    private void carregarClientesDoArquivo() {
        String arquivoClientes = "data/clientes.txt";
        try {
            criarArquivoSeNecessario(arquivoClientes);
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoClientes))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] dados = linha.split(",");
                    int id = Integer.parseInt(dados[0].trim());
                    String nome = dados[1].trim();
                    String endereco = dados[2].trim();
                    String telefone = dados[3].trim();
                    Clientes cliente = new Clientes(id, nome, endereco, telefone);
                    clientes.add(cliente);
                }
                System.out.println("Clientes carregados do arquivo clientes.txt.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar clientes do arquivo " + arquivoClientes + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato no arquivo de clientes: " + e.getMessage());
        }
    }

    private void carregarCarrosDoArquivo() {
        String arquivoCarros = "data/carros.txt";
        try {
            criarArquivoSeNecessario(arquivoCarros);
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCarros))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] dados = linha.split(",");
                    String nome = dados[0].trim();
                    String modelo = dados[1].trim();
                    String marca = dados[2].trim();
                    int ano = Integer.parseInt(dados[3].trim());
                    String numChassi = dados[4].trim();
                    String cor = dados[5].trim();
                    Carro carro = new Carro(nome, modelo, marca, ano, numChassi, cor);
                    estoqueCarros.adicionar(carro);
                }
                System.out.println("Carros carregados do arquivo " + arquivoCarros);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar carros do arquivo " + arquivoCarros + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato no arquivo de carros: " + e.getMessage());
        }
    }

    private void carregarFuncionariosDoArquivo() {
        String arquivoFuncionarios = "data/funcionarios.txt";
        try {
            criarArquivoSeNecessario(arquivoFuncionarios);
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoFuncionarios))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] dados = linha.split(",");
                    int id = Integer.parseInt(dados[0].trim());
                    String nome = dados[1].trim();
                    int idade = Integer.parseInt(dados[2].trim());
                    String cpf = dados[3].trim();
                    String endereco = dados[4].trim();
                    String email = dados[5].trim();
                    String telefone = dados[6].trim();
                    Funcionarios funcionario = new Funcionarios(id, nome, idade, cpf, endereco, email, telefone);
                    funcionarios.add(funcionario);
                }
                System.out.println("Funcionários carregados do arquivo " + arquivoFuncionarios);
            }
        } catch (IOException e) {
            System.out
                    .println("Erro ao carregar funcionários do arquivo " + arquivoFuncionarios + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato no arquivo de funcionários: " + e.getMessage());
        }
    }

    private void carregarPecasDoArquivo() {
        String arquivoPecas = "data/pecas.txt";
        try {
            criarArquivoSeNecessario(arquivoPecas);
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPecas))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    String[] dados = linha.split(",");
                    String id = dados[0].trim();
                    String nome = dados[1].trim();
                    int quantidade = Integer.parseInt(dados[2].trim());
                    float valorCusto = Float.parseFloat(dados[3].trim());
                    Peca peca = new Peca(id, nome, quantidade, valorCusto);
                    estoquePecas.adicionar(peca);
                }
                System.out.println("Peças carregadas do arquivo " + arquivoPecas);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar peças do arquivo " + arquivoPecas + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato no arquivo de peças: " + e.getMessage());
        }
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" ==========================================");
            System.out.println("|        SISTEMA DA CONCESSIONÁRIA         |");
            System.out.println("|------------------------------------------|");
            System.out.println("|                                          |");
            System.out.println("|  1. Menu de Clientes                     |");
            System.out.println("|  2. Menu de Funcionários                 |");
            System.out.println("|  3. Menu de Carros                       |");
            System.out.println("|  4. Menu de Estoque                      |");
            System.out.println("|  0. Sair do Sistema                      |");
            System.out.println("|                                          |");
            System.out.println(" ========================================== ");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    menuClientes(scanner);
                    break;
                case 2:
                    menuFuncionarios(scanner);
                    break;
                case 3:
                    menuCarros(scanner);
                    break;
                case 4:
                    menuEstoque(scanner);
                    break;
                case 0:
                    System.out.println(" ========================================= ");
                    System.out.println("|   Obrigado por utilizar JavaMotors!      |");
                    System.out.println("|                                          |");
                    System.out.println("|   Esperamos vê-lo novamente em breve!    |");
                    System.out.println(" ========================================= ");

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Método para adicionar clientes
    public void adicionarCliente(int id, String nome, String endereco, String telefone) {
        Clientes cliente = new Clientes(id, nome, endereco, telefone);
        clientes.add(cliente);
        salvarClientesEmArquivo(); // Salva os clientes no arquivo após adicionar
        System.out.println("Cliente adicionado com sucesso.");
    }

    // Método para remover clientes
    public void removerCliente(int id) {
        Iterator<Clientes> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Clientes cliente = iterator.next();
            if (cliente.getId() == id) {
                iterator.remove(); // Remove o cliente usando o iterator
                salvarClientesEmArquivo(); // Atualiza o arquivo após remover o cliente
                System.out.println("Cliente removido com sucesso.");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    // Método para buscar clientes
    public Clientes buscarClientePorId(int id) {
        for (Clientes cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }

    // Método para exibir todos os clientes
    public void exibirClientes() {
        System.out.println("Lista de Clientes:");
        for (Clientes cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Método para salvar clientes em arquivo
    private void salvarClientesEmArquivo() {
        String arquivoClientes = "data/clientes.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoClientes))) {
            for (Clientes cliente : clientes) {
                writer.println(cliente.getId() + "," + cliente.getNome() + "," + cliente.getEndereco() + ","
                        + cliente.getTelefone());
            }
            System.out.println(arquivoClientes + " Foi Atualizado com sucesso! ");
        } catch (IOException e) {
            System.out.println("Erro ao salvar clientes no arquivo " + arquivoClientes + ": " + e.getMessage());
        }
    }

    // Menu de Clientes
    public void menuClientes(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ==========================================");
            System.out.println("|             MENU DE CLIENTES             |");
            System.out.println("|------------------------------------------|");
            System.out.println("|                                          |");
            System.out.println("|  1. Adicionar Cliente                    |");
            System.out.println("|  2. Remover Cliente                      |");
            System.out.println("|  3. Buscar Cliente                       |");
            System.out.println("|  4. Exibir Clientes                      |");
            System.out.println("|  0. Voltar ao menu principal             |");
            System.out.println("|                                          |");
            System.out.println("===========================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String enderecoCliente = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneCliente = scanner.nextLine();
                    adicionarCliente(idCliente, nomeCliente, enderecoCliente, telefoneCliente);
                    break;
                case 2:
                    System.out.print("Digite o ID do cliente a ser removido: ");
                    int idRemover = scanner.nextInt();
                    removerCliente(idRemover);
                    break;
                case 3:
                    System.out.print("Digite o ID do cliente a ser buscado: ");
                    int idBuscar = scanner.nextInt();
                    Clientes clienteEncontrado = buscarClientePorId(idBuscar);
                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado:");
                        System.out.println(clienteEncontrado);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    exibirClientes();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Método para adicionar funcionários
    public void adicionarFuncionario(int id, String nome, int idade, String cpf, String endereco, String email,
            String telefone) {
        Funcionarios funcionario = new Funcionarios(id, nome, idade, cpf, endereco, email, telefone);
        funcionarios.add(funcionario);
        salvarFuncionariosEmArquivo(); // Salva os funcionários no arquivo após adicionar
        System.out.println("Funcionário adicionado com sucesso.");
    }

    // Método para remover funcionários
    public void removerFuncionario(int id) {
        Iterator<Funcionarios> iterator = funcionarios.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Funcionarios funcionario = iterator.next();
            if (funcionario.getId() == id) {
                iterator.remove(); // Remove o funcionário usando o iterator
                salvarFuncionariosEmArquivo(); // Atualiza o arquivo após remover o funcionário
                System.out.println("Funcionário removido com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Método para buscar funcionários
    public Funcionarios buscarFuncionarioPorId(int id) {
        for (Funcionarios funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null; // Retorna null se o funcionário não for encontrado
    }

    // Método para exibir todos os funcionários
    public void exibirFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    // Método para salvar funcionários em arquivo
    private void salvarFuncionariosEmArquivo() {
        String arquivoFuncionarios = "data/funcionarios.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoFuncionarios))) {
            for (Funcionarios funcionario : funcionarios) {
                writer.println(funcionario.getId() + "," + funcionario.getNome() + "," + funcionario.getIdade() + ","
                        + funcionario.getCpf() + "," + funcionario.getEndereco() + "," + funcionario.getEmail() + ","
                        + funcionario.getTelefone_Celular());
            }
            System.out.println(arquivoFuncionarios + " Foi Atualizado com sucesso! ");

        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionários no arquivo " + arquivoFuncionarios + ": " + e.getMessage());
        }
    }

    // Menu de Funcionários
    public void menuFuncionarios(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ============================================ ");
            System.out.println("|            Menu de Funcionários            |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|  1. Adicionar Funcionário                  |");
            System.out.println("|  2. Remover Funcionário                    |");
            System.out.println("|  3. Buscar Funcionário                     |");
            System.out.println("|  4. Exibir Funcionários                    |");
            System.out.println("|                                            |");
            System.out.println("|  0. Voltar ao menu principal               |");
            System.out.println("|--------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("=============================================");

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do funcionário: ");
                    int idFuncionario = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Digite a idade do funcionário: ");
                    int idadeFuncionario = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o CPF do funcionário: ");
                    String cpfFuncionario = scanner.nextLine();
                    System.out.print("Digite o endereço do funcionário: ");
                    String enderecoFuncionario = scanner.nextLine();
                    System.out.print("Digite o e-mail do funcionário: ");
                    String emailFuncionario = scanner.nextLine();
                    System.out.print("Digite o telefone do funcionário: ");
                    String telefoneFuncionario = scanner.nextLine();
                    adicionarFuncionario(idFuncionario, nomeFuncionario, idadeFuncionario, cpfFuncionario,
                            enderecoFuncionario, emailFuncionario, telefoneFuncionario);
                    break;
                case 2:
                    System.out.print("Digite o ID do funcionário a ser removido: ");
                    int idRemover = scanner.nextInt();
                    removerFuncionario(idRemover);
                    break;
                case 3:
                    System.out.print("Digite o ID do funcionário a ser buscado: ");
                    int idBuscar = scanner.nextInt();
                    Funcionarios funcionarioEncontrado = buscarFuncionarioPorId(idBuscar);
                    if (funcionarioEncontrado != null) {
                        System.out.println("Funcionário encontrado:");
                        System.out.println(funcionarioEncontrado);
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case 4:
                    exibirFuncionarios();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Método para adicionar carros
    public void adicionarCarro(String nome, String modelo, String marca, int ano, String numChassi, String cor) {
        Carro carro = new Carro(nome, modelo, marca, ano, numChassi, cor);
        carros.add(carro); // Adiciona à lista de carros
        salvarCarrosEmArquivo(); // Salva os carros no arquivo após adicionar
        System.out.println("Carro adicionado com sucesso.");
    }

    // Método para remover carros
    public void removerCarro(String numChassi) {
        Iterator<Carro> iterator = estoqueCarros.getLista().iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Carro carro = iterator.next();
            if (carro.getNumChassi().equals(numChassi)) {
                iterator.remove(); // Remove o carro usando o iterator
                salvarCarrosEmArquivo(); // Atualiza o arquivo após remover o carro
                System.out.println("Carro removido com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Carro não encontrado.");
        }
    }

    // Método para buscar carros
    public Carro buscarCarroPorChassi(String numChassi) {
        for (Carro carro : estoqueCarros.getLista()) {
            if (carro.getNumChassi().equals(numChassi)) {
                return carro;
            }
        }
        return null; // Retorna null se o carro não for encontrado
    }

    // Método para exibir todos os carros
    public void exibirCarros() {
        System.out.println("Lista de Carros:");
        for (Carro carro : estoqueCarros.getLista()) {
            System.out.println(carro);
        }
    }

    // Método para salvar carros em arquivo
    private void salvarCarrosEmArquivo() {
        String arquivoCarros = "data/carros.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoCarros))) {
            for (Carro carro : estoqueCarros.getLista()) {
                writer.println(carro.getNome() + "," + carro.getModelo() + "," + carro.getMarca() + ","
                        + carro.getAno() + "," + carro.getNumChassi() + "," + carro.getCor());
            }
            System.out.println(arquivoCarros + " Foi Atualizado com sucesso! ");
        } catch (IOException e) {
            System.out.println("Erro ao salvar carros no arquivo " + arquivoCarros + ": " + e.getMessage());
        }
    }

    public void menuCarros(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ============================================");
            System.out.println("|              Menu de Carros                |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|  1. Adicionar Carro                        |");
            System.out.println("|  2. Remover Carro                          |");
            System.out.println("|  3. Buscar Carro por Chassi                |");
            System.out.println("|  4. Exibir Carros                          |");
            System.out.println("|  0. Voltar ao menu principal               |");
            System.out.println("|--------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("=============================================");

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do carro: ");
                    String nomeCarro = scanner.nextLine();
                    System.out.print("Digite o modelo do carro[HATCH/SEDAN]: ");
                    String modeloCarro = scanner.nextLine();
                    System.out.print("Digite a marca do carro: ");
                    String marcaCarro = scanner.nextLine();
                    System.out.print("Digite o ano do carro: ");
                    int anoCarro = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o número do chassi do carro: [*1111111*] ");
                    String chassiCarro = scanner.nextLine();
                    System.out.print("Digite a cor do carro: ");
                    String corCarro = scanner.nextLine();
                    adicionarCarro(nomeCarro, modeloCarro, marcaCarro, anoCarro, chassiCarro, corCarro);
                    break;
                case 2:
                    System.out.print("Digite o número do chassi do carro a ser removido: [*1111111*] ");
                    String chassiRemover = scanner.nextLine();
                    removerCarro(chassiRemover);
                    break;
                case 3:
                    System.out.print("Digite o número do chassi do carro a ser buscado: [*1111111*]");
                    String chassiBuscar = scanner.nextLine();
                    Carro carroEncontrado = buscarCarroPorChassi(chassiBuscar);
                    if (carroEncontrado != null) {
                        System.out.println("Carro encontrado:\n");
                        System.out.println(carroEncontrado);
                    } else {
                        System.out.println("Carro não encontrado.\n");
                    }
                    break;
                case 4:
                    exibirCarros();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Menu de Estoque
    public void menuEstoque(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ============================================ ");
            System.out.println("|              Menu de Estoque               |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|  1. Estoque de Peças                       |");
            System.out.println("|  2. Estoque de Carros                      |");
            System.out.println("|  0. Voltar ao menu principal               |");
            System.out.println("|--------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("=============================================");

            switch (opcao) {
                case 1:
                    menuEstoquePecas(scanner);
                    break;
                case 2:
                    menuEstoqueCarros(scanner);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Menu de Estoque de Peças
    public void menuEstoquePecas(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ============================================ ");
            System.out.println("|            Estoque de Peças                |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|  1. Adicionar Peça                         |");
            System.out.println("|  2. Remover Peça                           |");
            System.out.println("|  3. Buscar Peça                            |");
            System.out.println("|  4. Exibir Estoque de Peças                |");
            System.out.println("|                                            |");
            System.out.println("|  0. Voltar ao menu anterior                |");
            System.out.println("|--------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("=============================================");

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da peça: ");
                    String idPeca = scanner.nextLine();
                    System.out.print("Digite o nome da peça: ");
                    String nomePeca = scanner.nextLine();
                    System.out.print("Digite a quantidade da peça: ");
                    int quantidadePeca = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o valor de custo da peça: ");
                    float valorCustoPeca = scanner.nextFloat();
                    scanner.nextLine(); // Limpar o buffer
                    adicionarPeca(idPeca, nomePeca, quantidadePeca, valorCustoPeca);
                    break;
                case 2:
                    System.out.print("Digite o ID da peça a ser removida: ");
                    String idRemover = scanner.nextLine();
                    removerPeca(idRemover);
                    break;
                case 3:
                    System.out.print("Digite o ID da peça a ser buscada: ");
                    String idBuscar = scanner.nextLine();
                    Peca pecaEncontrada = buscarPecaPorId(idBuscar);
                    if (pecaEncontrada != null) {
                        System.out.println("Peça encontrada:");
                        System.out.println(pecaEncontrada);
                    } else {
                        System.out.println("Peça não encontrada.");
                    }
                    break;
                case 4:
                    exibirEstoquePecas();
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Menu de Estoque de Carros
    public void menuEstoqueCarros(Scanner scanner) {
        int opcao;

        do {
            System.out.println(" ============================================ ");
            System.out.println("|              Estoque de Carros             |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|  1. Adicionar Carro ao Estoque             |");
            System.out.println("|  2. Remover Carro do Estoque               |");
            System.out.println("|  3. Buscar Carro no Estoque                |");
            System.out.println("|  4. Exibir Estoque de Carros               |");
            System.out.println("|                                            |");
            System.out.println("|  0. Voltar ao menu anterior                |");
            System.out.println("|--------------------------------------------|");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("=============================================");

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do chassi do carro a adicionar no estoque: ");
                    String chassiCarro = scanner.nextLine();
                    adicionarCarroAoEstoque(chassiCarro);
                    break;
                case 2:
                    System.out.print("Digite o número do chassi do carro a remover do estoque: ");
                    String chassiRemover = scanner.nextLine();
                    removerCarroDoEstoque(chassiRemover);
                    break;
                case 3:
                    System.out.print("Digite o número do chassi do carro a buscar no estoque: ");
                    String chassiBuscar = scanner.nextLine();
                    Carro carroEncontrado = buscarCarroNoEstoque(chassiBuscar);
                    if (carroEncontrado != null) {
                        System.out.println("Carro encontrado no estoque:");
                        System.out.println(carroEncontrado);
                    } else {
                        System.out.println("Carro não encontrado no estoque.");
                    }
                    break;
                case 4:
                    exibirEstoqueCarros();
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    // Método para salvar peças em arquivo
    private void salvarPecasEmArquivo() {
        String arquivoPecas = "data/pecas.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoPecas))) {
            for (Peca peca : estoquePecas.getLista()) {
                writer.println(peca.getId() + "," + peca.getNome() + "," + peca.getQtd() + ","
                        + peca.getValorCusto());
            }
            System.out.println(arquivoPecas + " Foi Atualizado com sucesso!\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar peças no arquivo " + arquivoPecas + ": " + e.getMessage());
        }
    }

    // Método para adicionar peças
    public void adicionarPeca(String id, String nome, int quantidade, float valorCusto) {
        Peca peca = new Peca(id, nome, quantidade, valorCusto);
        estoquePecas.adicionar(peca);
        salvarPecasEmArquivo(); // Salva as peças no arquivo após adicionar
        System.out.println("Peça adicionada ao estoque com sucesso.");
    }

    public void removerPeca(String id) {
        Iterator<Peca> iterator = estoquePecas.getLista().iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Peca peca = iterator.next();
            if (peca.getId().equals(id)) {
                iterator.remove(); // Remove a peça usando o iterator
                salvarPecasEmArquivo(); // Atualiza o arquivo após remover a peça
                System.out.println("Peça removida do estoque com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Peça não encontrada.");
        }
    }

    public Peca buscarPecaPorId(String id) {
        for (Peca peca : estoquePecas.getLista()) {
            if (peca.getId().equals(id)) {
                return peca;
            }
        }
        return null; // Retorna null se a peça não for encontrada
    }

    public void exibirEstoquePecas() {
        System.out.println("Estoque de Peças:");
        for (Peca peca : estoquePecas.getLista()) {
            System.out.println(peca);
        }
    }

    // Método para adicionar carro ao estoque
    public void adicionarCarroAoEstoque(String numChassi) {
        // Verifica se o carro já está na lista de carros
        Carro carroExistente = buscarCarroPorChassi(numChassi);
        if (carroExistente == null) {
            System.out.println("Erro: O carro com número de chassi " + numChassi + " não está cadastrado.");
            return;
        }

        // Verifica se o carro já está no estoque
        Carro carroNoEstoque = estoqueCarros.buscarCarroPorChassi(numChassi);
        if (carroNoEstoque != null) {
            System.out.println("Erro: O carro com número de chassi " + numChassi + " já está no estoque.");
            return;
        }

        // Adiciona o carro ao estoque
        estoqueCarros.adicionar(carroExistente);
        salvarCarrosEmArquivo(); // Salva os carros no arquivo após adicionar ao estoque
        System.out.println("Carro adicionado ao estoque com sucesso.");
    }

    private Carro buscarCarroNoEstoque(String numChassi) {
        for (Carro carro : carros) {
            if (carro.getNumChassi().equals(numChassi)) {
                return carro;
            }
        }
        return null; // Retorna null se o carro não for encontrado na lista de carros
    }

    // Método para remover carro do estoque
    public void removerCarroDoEstoque(String numChassi) {
        Iterator<Carro> iterator = estoqueCarros.getLista().iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Carro carro = iterator.next();
            if (carro.getNumChassi().equals(numChassi)) {
                iterator.remove(); // Remove o carro usando o iterator
                salvarCarrosEmArquivo(); // Atualiza o arquivo após remover do estoque
                System.out.println("Carro removido do estoque com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Carro não encontrado no estoque.");
        }
    }

    public void exibirEstoqueCarros() {
        System.out.println("Estoque de Carros:");
        for (Carro carro : estoqueCarros.getLista()) {
            System.out.println(carro);
        }
    }
}
