import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        
        int resultado = somarTresNumeros(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);
        scanner.close();
    }

    public static int somarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
} 