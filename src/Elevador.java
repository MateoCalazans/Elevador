
public class Elevador {
    private int AndarAtual;
    private int TotalAndares;
    private float CapacidadeDoElevador;
    private int pessoas;

    // Construtor
    public Elevador(int andarAtual, int totalAndares, float capacidadeDoElevador, int pessoas) {
        AndarAtual = andarAtual;
        TotalAndares = totalAndares;
        CapacidadeDoElevador = capacidadeDoElevador;
        this.pessoas = pessoas;
    }

    // Métodos do elevador
    public void entra() {
        if (pessoas < CapacidadeDoElevador) {
            pessoas++;
            System.out.println("Uma pessoa entrou. Total de pessoas: " + pessoas);
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void sai() {
        if (pessoas > 0) {
            pessoas--;
            System.out.println("Uma pessoa saiu. Total de pessoas: " + pessoas);
        } else {
            System.out.println("Não há ninguém no elevador para sair.");
        }
    }

    public void sobe() {
        if (AndarAtual < TotalAndares) {
            AndarAtual++;
            System.out.println("O elevador subiu para o andar: " + AndarAtual);
        } else {
            System.out.println("Você já está no último andar.");
        }
    }

    public void desce() {
        if (AndarAtual > 0) {
            AndarAtual--;
            System.out.println("O elevador desceu para o andar: " + AndarAtual);
        } else {
            System.out.println("Você já está no térreo.");
        }
    }

    public void status() {
        System.out.println("Andar Atual: " + AndarAtual);
        System.out.println("Pessoas presentes: " + pessoas);
        System.out.println("Capacidade Total: " + CapacidadeDoElevador);
    }
}