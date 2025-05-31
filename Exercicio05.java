import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo do item: ");
        double custo = scanner.nextDouble();
        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = scanner.nextDouble();
        
        double custoComImposto = somaImposto(taxaImposto, custo);
        System.out.printf("Custo com imposto: R$ %.2f%n", custoComImposto);
        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        return custo * (1 + taxaImposto / 100);
    }
} 