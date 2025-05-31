import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();
            
            char periodo = converterHorario(hora, minutos);
            exibirHorario(hora, minutos, periodo);
            
            System.out.print("\nDeseja converter outro horário? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
        
        scanner.close();
    }

    public static char converterHorario(int hora, int minutos) {
        if (hora >= 12) {
            return 'P';
        }
        return 'A';
    }

    public static void exibirHorario(int hora, int minutos, char periodo) {
        int hora12 = hora > 12 ? hora - 12 : (hora == 0 ? 12 : hora);
        System.out.printf("%d:%02d %s.M.", hora12, minutos, periodo == 'A' ? "A" : "P");
    }
} 