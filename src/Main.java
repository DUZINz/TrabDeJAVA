import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem de boas-vindas com desenho
        System.out.println(" =========================================");
        System.out.println("|           BEM VINDO A JavaMotors        |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|    ███████╗ ██████╗ ██████╗ ██╗   ██╗   |");
        System.out.println("|    ██╔════╝██╔═══██╗██╔══██╗██║   ██║   |");
        System.out.println("|    █████╗  ██║   ██║██████╔╝██║   ██║   |");
        System.out.println("|    ██╔══╝  ██║   ██║██╔══██╗██║   ██║   |");
        System.out.println("|    ██║     ╚██████╔╝██║  ██║╚██████╔╝   |");
        System.out.println("|    ╚═╝      ╚═════╝ ╚═╝  ╚═╝ ╚═════╝    |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
        System.out.println("Pressione Enter para começar o programa...");

        // Aguardar até que o usuário pressione Enter
        scanner.nextLine(); // Aguarda o usuário pressionar Enter

        // Iniciar o programa principal da concessionária
        ConcessionariaApp app = new ConcessionariaApp();
        app.menuPrincipal();

        // Fechar o scanner ao final do programa
        scanner.close();

    }
}
