import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar elevador com 0 pessoas e 0 andar
        Elevador elevador = new Elevador(0, 10, 5, 0); // Exemplo: capacidade para 5 pessoas, 10 andares

        Scanner cin = new Scanner(System.in);  // O nome da variável do Scanner é "cin"
        int opcao;

        // Menu de interação
        do {
            System.out.println("\nMenu do Elevador:");
            System.out.println("1. Entrar uma pessoa");
            System.out.println("2. Sair uma pessoa");
            System.out.println("3. Subir andar");
            System.out.println("4. Descer andar");
            System.out.println("5. Exibir status do elevador");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = cin.nextInt();  // Use o "cin" para ler a entrada do usuário

            switch (opcao) {
                case 1:
                    elevador.entra();
                    break;
                case 2:
                    elevador.sai();
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 5:
                    elevador.status();
                    break;
                case 6:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opcao invalida! Escolha novamente.");
            }

        } while (opcao != 6); // Sai do loop quando o usuário escolhe a opção 6

        cin.close();  // Agora estamos fechando o Scanner corretamente
    }
}