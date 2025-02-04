import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // inicio e fim das horas
            System.out.print("hora do início: ");
            int horaInicio = scanner.nextInt();
            System.out.print("hora do fim: ");
            int horaFim = scanner.nextInt();

            // Validar as horas
            if (horaInicio < 0 || horaInicio >= 24 || horaFim < 0 || horaFim >= 24) {
                System.out.println("invalido");
                return;
            }

            // duração do jogo
            int duracao;
            if (horaInicio < horaFim) {
                duracao = horaFim - horaInicio;
            } else if (horaInicio > horaFim) {
                duracao = 24 - horaInicio + horaFim;
            } else {
                duracao = 24; // Caso início e fim sejam iguais
            }

            // Exibindo o tempo
            System.out.println("O JOGO DUROU " + duracao + " HORAS");
        } finally {
            scanner.close(); // existe um erro ao fechar o scanner que diz q ele n consegue fechar no local que voce deixou, entao usei o try finally dessa forma garante q o scanner.close seja chamado msm q o programa tiver q sair devido a uma entrada invalida ou outro erro qualquer.
        }
    }
}