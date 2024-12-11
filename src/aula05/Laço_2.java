package aula05;

import java.util.Scanner;

public class Laço_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0, acumulador = 0;
        while (contador < 5) {
            contador++;
            System.out.print("Digite um número: ");
            acumulador+=scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Contador está em %d e o acumulador em %d\n", contador, acumulador);
        }
    }
}