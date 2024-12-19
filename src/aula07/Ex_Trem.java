package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_Trem {
    public static void main(String[] args) throws InterruptedException {
        double posicao_inicial_a;
        double posicao_inicial_b;
        double posicao_final_a;
        double posicao_final_b;
        double velocidade_a;
        double velocidade_b;
        double tempo;
        double minutos;
        double segundos;
        String opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Você deseja descobrir sobre os Trens A e B? (sim/nao): ");
        opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("não")) {
            System.out.print("Não quer descobrir sobre os trens. Até mais!");
        } else {
            while (!opcao.equalsIgnoreCase("sair")) {
                System.out.print("Vamos descobrir mais sobre os trens?\n Caso não queira, digite 'sair': \n");
                opcao = scanner.nextLine();
                try {


                    // POSIÇÃO INICIAL DO TREM A
                    System.out.print("Digite a posição inicial do Trem A (entre 0 e 10000 km): ");
                    posicao_inicial_a = scanner.nextDouble();
                    Thread.sleep(1000);
                    if (posicao_inicial_a < 0 || posicao_inicial_a > 10000) {
                        System.out.print("A posição do Trem A deve estar entre 0 e 10.000 km.\n");
                        continue; // Volta para o início do loop e pede novamente
                    }


                    // VELOCIDADE DO TREM A
                    System.out.print("Digite a velocidade do Trem A (em km/h): ");
                    velocidade_a = scanner.nextDouble();
                    Thread.sleep(1000);
                    if (velocidade_a <= 0 || velocidade_a >= 300) {
                        System.out.print("A velocidade do Trem A deve ser maior que 0 e menor que 300 km/h.\n");
                        continue;
                    }


                    // POSIÇÃO INICIAL DO TREM B
                    System.out.print("Digite a posição inicial do Trem B (entre 0 e 10000 km): ");
                    posicao_inicial_b = scanner.nextDouble();
                    Thread.sleep(1000);
                    if (posicao_inicial_b < 0 || posicao_inicial_b > 10000) {
                        System.out.print("A posição do Trem B deve estar entre 0 e 10.000 km.\n");
                        continue;
                    }


                    // VELOCIDADE DO TREM B
                    System.out.print("Digite a velocidade do Trem B (em km/h): ");
                    velocidade_b = scanner.nextDouble();
                    Thread.sleep(1000);
                    if (velocidade_b <= 0 || velocidade_b >= 300) {
                        System.out.print("A velocidade do Trem B deve ser maior que 0 e menor que 300 km/h.\n");
                        continue;
                    }


                    // Cálculo do tempo de colisão
                    tempo = (posicao_inicial_a - posicao_inicial_b) / (velocidade_b - velocidade_a);
                    if (tempo > 0) {
                        posicao_final_a = posicao_inicial_a + (velocidade_a * tempo);
                        posicao_final_b = posicao_inicial_b + (velocidade_b * tempo);
                        minutos = tempo / 60;
                        segundos = tempo % 60;
                        System.out.printf("Os trens se colidem em %.2f minutos, ou %.0f segundos.\n", minutos, segundos);
                    } else {
                        System.out.print("Os trens não se colidem...\n");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Você digitou um caractere inválido.\nPor favor, digite novamente.");
                    scanner.nextLine();
                }
            }
        }
    }
}
