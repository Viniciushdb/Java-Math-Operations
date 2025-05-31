import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        char resultado = verificarPositivoNegativo(numero);
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }

    public static char verificarPositivoNegativo(int numero) {
        return numero > 0 ? 'P' : 'N';
    }
} 