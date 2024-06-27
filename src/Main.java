import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        scanner.nextLine();

        ConcessionariaApp app = new ConcessionariaApp();
        app.menuPrincipal();

        scanner.close();

    }
}
