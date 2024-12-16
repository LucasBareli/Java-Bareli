package aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true){
            try {
                System.out.println("Digite um número: ");
                numero = scanner.nextInt();
                if (numero < 20) {
                    System.out.println("O número deve ser maior que 20");
                    continue;
                }
                else {
                    break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Ops... Você digitou caracteres invalidos. Digite apenas números");
            }
            finally {
                System.out.println("Isso é sempre executado");
            }
            scanner.nextLine();
        }
        System.out.println(numero);
    }
}
