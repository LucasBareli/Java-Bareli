package aula04;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        int numero;
        String resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            resultado = "O número é par";
        }

        else {
            resultado = "O número é impar";
        }

        System.out.println(resultado);
    }
}
