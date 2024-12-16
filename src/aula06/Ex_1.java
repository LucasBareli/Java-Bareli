package aula06;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) throws InterruptedException {
        int caso;
        int numero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caso: ");
        caso = scanner.nextInt();

        switch (caso) {
            case 1:
                System.out.println("Escolheu o FOR");
                Thread.sleep(1000);
                for (int i = 0; i <= 10; i++) {
                    for (int j = 0; j <= 10; j++) {
                        System.out.printf("%d X %d = %d\n",i,j,i*j);
                    }
                }
                break;
            case 2:
                System.out.println("Escolheu o WHILE");


                Thread.sleep(1000);
                while (numero<10) {
                    int multiplicador = 0;
                    numero++;
                    while (multiplicador<=10) {
                        System.out.printf("%d X %d = %d\n",numero,multiplicador,numero * multiplicador);
                        multiplicador++;
                    }
                }
                break;
            case 3:
                System.out.println("Escolheu o FOR e WHILE");
                Thread.sleep(1000);
                while (numero < 10){
                    numero++;
                    for (int i = 0; i <= 10; i++) {
                        System.out.printf("%d X %d = %d\n", numero, i, numero * i);
                    }
                }
                break;
            default:
                System.out.println("Não tem esse case");
        }

    }
}