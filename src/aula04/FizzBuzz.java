package aula04;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int numero;
        String resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0) {
            resultado = "FIZZBUZZ";
        }

        else if (numero % 2 == 0) {
            resultado = "BUZZ";
        }

        else if (numero % 5 == 0) {
            resultado = "FIZZ";
        }

        else {
            resultado = "Erro, seu número não é aceito";
        }

        System.out.println(resultado);
    }
}
